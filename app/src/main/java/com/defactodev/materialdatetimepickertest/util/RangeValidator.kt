package com.defactodev.materialdatetimepickertest.util

import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import com.google.android.material.datepicker.CalendarConstraints
import java.text.SimpleDateFormat
import java.util.Calendar

class RangeDateValidator: CalendarConstraints.DateValidator {
    private var days: Array<Long> = arrayOf<Long>()
    private var treeMap = hashMapOf<String, BinaryTree>()

    constructor( days: Array<Long>){
        this@RangeDateValidator.days = days
    }

    constructor(treeMap: HashMap<String, BinaryTree>) {
        this@RangeDateValidator.treeMap = treeMap
    }

    constructor(parcel: Parcel) : this(
        parcel.createLongArray()!!.toTypedArray()
    )

    fun format(date: Long): String{

        val calendar = Calendar.getInstance().apply {
            timeInMillis = date
        }

        val dateFormat = SimpleDateFormat("yyyy-MM-dd")
        val formattedDate = dateFormat.format(calendar.time)

        return formattedDate
    }

    override fun isValid(date: Long): Boolean {
        if(treeMap.size > 0){
            val daycal  = Calendar.getInstance().apply {
                timeInMillis = date
            }
            val dayNode = treeMap[calendarToYearMonth(daycal)]?.find(date)
            if(dayNode !== null){
                return true
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

