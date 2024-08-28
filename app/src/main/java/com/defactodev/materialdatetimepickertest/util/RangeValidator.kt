package com.defactodev.materialdatetimepickertest.util

import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import com.google.android.material.datepicker.CalendarConstraints
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.TimeZone

class RangeDateValidator: CalendarConstraints.DateValidator {
    private var days: Array<Long> = arrayOf<Long>()
    private var treeMap = hashMapOf<String, BinaryTree>()
    private var listMap = hashMapOf<String, MutableList<Long>>()
    private var list: List<Long> = listOf<Long>()

    constructor( days: Array<Long>){
        this@RangeDateValidator.days = days
    }

    constructor(treeMap: HashMap<String, BinaryTree>) {
        this@RangeDateValidator.treeMap = treeMap
    }

    constructor( list: List<Long>){
        this@RangeDateValidator.list = list
    }
/*
    constructor( listMap: HashMap<String, MutableList<Long>>){
        this@RangeDateValidator.listMap = listMap
    }*/

    constructor(parcel: Parcel) : this(
        parcel.createLongArray()!!.toTypedArray()
    )

    override fun isValid(date: Long): Boolean {
        //return true

        if(listMap.size > 0){
            val daycal  = Calendar.getInstance(TimeZone.getTimeZone("UTC")).apply {
                timeInMillis = date
            }

            val L = listMap[calendarToYearMonth(daycal)]

            if(L != null){
                for(day in L){
                    Log.d("isValid", "${format(day)},${format(date)} | ${day},$date")
                    if(day == date){
                        return true
                    }
                }
            }

            return false
        }

        if(list.isNotEmpty()){
            for(day in list){
                if(day == date){
                    return true
                }
            }
            return false
        }

        if(treeMap.size > 0){
            val daycal  = Calendar.getInstance().apply {
                timeInMillis = date
            }
            val dayNode = treeMap[calendarToYearMonth(daycal)]?.find(date)
            if(dayNode !== null){
                return true
            } else {
                Log.d("noHashMember", "${format(date)}-$date")
            }
        } else {
            for (day in days){
                if(format(day) == format(date))
                //Log.d("isValid", "${format(day)},${format(date)} | $day,$date")

                    if(date == day) {
                        //Log.d("isValidMatch", "${format(day)}")
                        return true
                    }
            }
        }
        return false
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeArray(days)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<RangeDateValidator> {
        override fun createFromParcel(parcel: Parcel): RangeDateValidator {
            return RangeDateValidator(parcel)
        }

        override fun newArray(size: Int): Array<RangeDateValidator?> {
            return arrayOfNulls(size)
        }
    }
}

