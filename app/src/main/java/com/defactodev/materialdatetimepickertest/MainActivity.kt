package com.defactodev.materialdatetimepickertest

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.defactodev.materialdatetimepickertest.util.BinaryTree
import com.defactodev.materialdatetimepickertest.util.RangeDateValidator
import com.defactodev.materialdatetimepickertest.util.calendarToYearMonth
import com.defactodev.materialdatetimepickertest.util.getCalendar
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.MaterialDatePicker
import java.util.Calendar
import java.util.TimeZone

class MainActivity : AppCompatActivity() {
    private val days = mutableListOf<Calendar>()
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btMostrar = findViewById<Button>(R.id.btMostrar)

        days.add(getCalendar(2024, 2, 4))
        days.add(getCalendar(2024, 2, 7))
        days.add(getCalendar(2024, 2, 11))
        days.add(getCalendar(2024, 2, 15))
        days.add(getCalendar(2024, 2, 18))
        days.add(getCalendar(2024, 2, 21))
        days.add(getCalendar(2024, 2, 25))
        days.add(getCalendar(2024, 2, 28))
        days.add(getCalendar(2024, 1, 3))
        days.add(getCalendar(2024, 1, 7))
        days.add(getCalendar(2024, 1, 10))
        days.add(getCalendar(2024, 1, 14))
        days.add(getCalendar(2024, 1, 17))
        days.add(getCalendar(2024, 1, 21))
        days.add(getCalendar(2024, 1, 24))
        days.add(getCalendar(2024, 1, 26))
        days.add(getCalendar(2024, 1, 28))
        days.add(getCalendar(2024, 1, 31))
        days.add(getCalendar(2023, 12, 1))
        days.add(getCalendar(2023, 12, 3))
        days.add(getCalendar(2023, 12, 6))
        days.add(getCalendar(2023, 12, 10))
        days.add(getCalendar(2023, 12, 13))
        days.add(getCalendar(2023, 12, 17))
        days.add(getCalendar(2023, 12, 21))
        days.add(getCalendar(2023, 12, 24))
        days.add(getCalendar(2023, 12, 27))
        days.add(getCalendar(2023, 12, 29))
        days.add(getCalendar(2023, 12, 31))
        days.add(getCalendar(2023, 11, 1))
        days.add(getCalendar(2023, 11, 5))
        days.add(getCalendar(2023, 11, 8))
        days.add(getCalendar(2023, 11, 12))
        days.add(getCalendar(2023, 11, 15))
        days.add(getCalendar(2023, 11, 19))
        days.add(getCalendar(2023, 11, 22))
        days.add(getCalendar(2023, 11, 26))
        days.add(getCalendar(2023, 11, 29))
        days.add(getCalendar(2023, 10, 1))
        days.add(getCalendar(2023, 10, 4))
        days.add(getCalendar(2023, 10, 9))
        days.add(getCalendar(2023, 10, 11))
        days.add(getCalendar(2023, 10, 15))
        days.add(getCalendar(2023, 10, 18))
        days.add(getCalendar(2023, 10, 20))
        days.add(getCalendar(2023, 10, 22))
        days.add(getCalendar(2023, 10, 26))
        days.add(getCalendar(2023, 10, 29))
        days.add(getCalendar(2023, 9, 3))
        days.add(getCalendar(2023, 9, 6))
        days.add(getCalendar(2023, 9, 10))
        days.add(getCalendar(2023, 9, 13))
        days.add(getCalendar(2023, 9, 17))
        days.add(getCalendar(2023, 9, 20))
        days.add(getCalendar(2023, 9, 24))
        days.add(getCalendar(2023, 9, 27))
        days.add(getCalendar(2023, 9, 29))
        days.add(getCalendar(2023, 8, 2))
        days.add(getCalendar(2023, 8, 6))
        days.add(getCalendar(2023, 8, 9))
        days.add(getCalendar(2023, 8, 13))
        days.add(getCalendar(2023, 8, 16))
        days.add(getCalendar(2023, 8, 20))
        days.add(getCalendar(2023, 8, 23))
        days.add(getCalendar(2023, 8, 25))
        days.add(getCalendar(2023, 8, 27))
        days.add(getCalendar(2023, 8, 30))
        days.add(getCalendar(2023, 7, 2))
        days.add(getCalendar(2023, 7, 5))
        days.add(getCalendar(2023, 7, 9))
        days.add(getCalendar(2023, 7, 12))
        days.add(getCalendar(2023, 7, 16))
        days.add(getCalendar(2023, 7, 19))
        days.add(getCalendar(2023, 7, 21))
        days.add(getCalendar(2023, 7, 23))
        days.add(getCalendar(2023, 7, 26))
        days.add(getCalendar(2023, 7, 30))
        days.add(getCalendar(2023, 6, 4))
        days.add(getCalendar(2023, 6, 7))
        days.add(getCalendar(2023, 6, 11))
        days.add(getCalendar(2023, 6, 14))
        days.add(getCalendar(2023, 6, 18))
        days.add(getCalendar(2023, 6, 21))
        days.add(getCalendar(2023, 6, 25))
        days.add(getCalendar(2023, 6, 28))
        days.add(getCalendar(2023, 6, 30))
        days.add(getCalendar(2023, 5, 3))
        days.add(getCalendar(2023, 5, 7))
        days.add(getCalendar(2023, 5, 10))
        days.add(getCalendar(2023, 5, 14))
        days.add(getCalendar(2023, 5, 17))
        days.add(getCalendar(2023, 5, 21))
        days.add(getCalendar(2023, 5, 24))
        days.add(getCalendar(2023, 5, 26))
        days.add(getCalendar(2023, 5, 28))
        days.add(getCalendar(2023, 5, 31))
        days.add(getCalendar(2023, 4, 2))
        days.add(getCalendar(2023, 4, 5))
        days.add(getCalendar(2023, 4, 9))
        days.add(getCalendar(2023, 4, 12))
        days.add(getCalendar(2023, 4, 16))
        days.add(getCalendar(2023, 4, 19))
        days.add(getCalendar(2023, 4, 23))
        days.add(getCalendar(2023, 4, 26))
        days.add(getCalendar(2023, 4, 28))
        days.add(getCalendar(2023, 4, 30))
        days.add(getCalendar(2023, 3, 1))
        days.add(getCalendar(2023, 3, 5))
        days.add(getCalendar(2023, 3, 8))
        days.add(getCalendar(2023, 3, 12))
        days.add(getCalendar(2023, 3, 15))
        days.add(getCalendar(2023, 3, 19))
        days.add(getCalendar(2023, 3, 22))
        days.add(getCalendar(2023, 3, 26))
        days.add(getCalendar(2023, 3, 29))
        days.add(getCalendar(2023, 3, 31))
        days.add(getCalendar(2023, 2, 1))
        days.add(getCalendar(2023, 2, 5))

        var listMap = hashMapOf<String, MutableList<Long>>()

        btMostrar.setOnClickListener{
            val map = hashMapOf<String, BinaryTree>()

            for (day in days){
                /*
                val identifier = calendarToYearMonth(day)

                if(!map.containsKey(identifier)) {
                    map[identifier] = BinaryTree()
                }

                map[identifier]?.add(day.timeInMillis)
                 */

                val identifier = calendarToYearMonth(day)

                if(!listMap.containsKey(identifier)) {
                    listMap[identifier] = mutableListOf<Long>()
                }

                listMap[identifier]?.add(day.timeInMillis)
            }

            var treeMap2 = hashMapOf<String, BinaryTree>()

            for((index, value) in listMap){
                treeMap2[index] = BinaryTree()
                value.sort()
                treeMap2[index]?.buildTree(value)
            }

            val longdates = days.map{it -> it.timeInMillis}

            val maxdate = longdates.maxOrNull()
            val minDate = longdates.minOrNull()

            //val dateValidator = RangeDateValidator(longdates.toTypedArray())
            //val dateValidator = RangeDateValidator(map)
            val dateValidator = RangeDateValidator(treeMap2)
            val constraintsBuilderRange = CalendarConstraints.Builder().apply {
                setFirstDayOfWeek(Calendar.MONDAY)

                setValidator(dateValidator)
            }

            if(maxdate != null) {
                constraintsBuilderRange.setEnd(maxdate)
                constraintsBuilderRange.setOpenAt(maxdate)
            }
            if(minDate != null)
                constraintsBuilderRange.setStart(minDate)

            val dp = MaterialDatePicker.Builder.datePicker()
                /**.setSelection(date.timeInMillis)
                .setCalendarConstraints(args.createCalendarConstraints())
                .setTitleText(args.title)
                .setPositiveButtonText(args.positiveButtonText)
                .setNegativeButtonText(args.negativeButtonText)
                .setInputMode(inputMode)
                .setTheme(theme)**/
                .setCalendarConstraints(constraintsBuilderRange.build())
                .build()

            dp.show(supportFragmentManager, "DATE_PICKER");
        }
    }
}