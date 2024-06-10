package com.example.smartweatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


private val Any.size: Any
    get() {}

private fun Any.putStringArrayListExtra(s: String) {

}

class MainActivity : AppCompatActivity() {

    private val days = arrayOf<String>(
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday"
    )
    private val MinTemperature = arrayOf<Int>(16, 22, 40, 23, 30, 15, 10)
    private val MaxTemperature = arrayOf<Int>(30, 35, 15, 15, 10, 19, 20)

    private fun clearFields(dayEditText: EditText?, averagetemperatureTextView: TextView?) {
    }

    private fun clearFields(dayEditText: EditText?) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val dayEditText = findViewById<EditText>(R.id.dayEditText)
        val averagetemperatureTextView = findViewById<TextView>(R.id.averagetemperatureTextView)
        val addButton = findViewById<Button>(R.id.addButton)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val viewDetailsButton = findViewById<Button>(R.id.viewDetailsButton)

        addButton.setOnClickListener {
            val day = dayEditText.text.toString()
            val averagetemperature = averagetemperatureTextView.text.toString().toIntOrNull()

            if (day.isNotEmpty() == null) {
                days.add(day)
                Toast.makeText(this, "Data Added", Toast.LENGTH_LONG).show()
                clearFields(dayEditText)
            } else {
                Toast.makeText(this, "Please fill the empty field", Toast.LENGTH_SHORT).show()
            }

            var minTemperatureDisplay = ""
            minTemperatureDisplay += "${MinTemperature[0]}\n"
            minTemperatureDisplay += "${MinTemperature[1]}\n"
            minTemperatureDisplay += "${MinTemperature[2]}\n"
            minTemperatureDisplay += "${MinTemperature[3]}\n"
            minTemperatureDisplay += "${MinTemperature[4]}\n"
            minTemperatureDisplay += "${MinTemperature[5]}\n"
            minTemperatureDisplay += "${MinTemperature[6]}\n"
            minTemperatureDisplay += "${MinTemperature[7]}\n"


            var maxTemperatureDisplay = ""
            maxTemperatureDisplay += "${MaxTemperature[0]}\n"
            maxTemperatureDisplay += "${MaxTemperature[1]}\n"
            maxTemperatureDisplay += "${MaxTemperature[2]}\n"
            maxTemperatureDisplay += "${MaxTemperature[3]}\n"
            maxTemperatureDisplay += "${MaxTemperature[4]}\n"
            maxTemperatureDisplay += "${MaxTemperature[5]}\n"
            maxTemperatureDisplay += "${MaxTemperature[6]}\n"
            maxTemperatureDisplay += "${MaxTemperature[7]}\n"

            val averagetemperature =
                arrayOf<Int>(16, 22, 40, 23, 30, 15, 10, 30, 35, 15, 15, 10, 19, 20)
            val averagetemperature = if (day.isNotEmpty()) averagetemperature / day.size
            else
                0

            // The code will clear all data saved in the arraylists!
            clearButton.setOnClickListener {
                //day.clear()
                //MinTemperature.clear()
                //MaxTemperature.clear()
                // Toast.makeText(this, "Data Cleared", Toast.LENGTH_SHORT).show()
                clearFields(dayEditText, averagetemperatureTextView)
            }

            viewDetailsButton.setOnClickListener {
                val intent = Intent(this, DetailedViewActivity::class.java)
                intent.putStringArrayListExtra("day",)
                intent.putStringArrayListExtra("averageTemperature",)
                intent.putStringArrayListExtra("WeatherCondition",)
                startActivity(intent)
            }
        }
    }
}
