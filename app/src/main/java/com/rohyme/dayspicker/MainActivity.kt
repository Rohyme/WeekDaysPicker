package com.rohyme.dayspicker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.rohyme.pickerlib.DayPicker
import com.rohyme.pickerlib.DaysModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dayPicker.setOnSelectListener(object :DayPicker.DayPickerListener{
            override fun onSelectedDaysChange(
                list: ArrayList<DaysModel.Day>,
                latestSelected: DaysModel.Day
            ) {
            Toast.makeText(this@MainActivity,latestSelected.arDay ,Toast.LENGTH_SHORT).show()
            }

        })

        Log.i("Day Picker" ,"selected list is ${dayPicker.getSelectedList()}")
    }
}
