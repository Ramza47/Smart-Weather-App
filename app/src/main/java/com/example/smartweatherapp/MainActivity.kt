package com.example.smartweatherapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

private val Any.size: Any
    get() {
        TODO("Not yet implemented")
    }

private fun Any.putStringArrayListExtra(s: String) {

}

class MainActivity : AppCompatActivity() {

    private val days = arrayOf(
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday"
    )
    private val minTemperature = arrayOf(16, 22, 40, 23, 30, 15, 10)
    private val maxTemperature = arrayOf(30, 35, 15, 15, 10, 19, 20)

    private fun clearFields(dayEditText: EditText?, averagetemperatureTextView: TextView?) {
    }

    private fun clearFields(dayEditText: EditText?) {

    }

    @SuppressLint("SetTextI18n")
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

            if (day.isNotEmpty() == null) {
                days.add(day)
                Toast.makeText(this, "Data Added", Toast.LENGTH_LONG).show()
                clearFields(dayEditText)
            } else {
                Toast.makeText(this, "Please fill the empty field", Toast.LENGTH_SHORT).show()
            }

            var minTemperatureDisplay = ""
            minTemperatureDisplay += "${minTemperature[0]}\n"
            minTemperatureDisplay += "${minTemperature[1]}\n"
            minTemperatureDisplay += "${minTemperature[2]}\n"
            minTemperatureDisplay += "${minTemperature[3]}\n"
            minTemperatureDisplay += "${minTemperature[4]}\n"
            minTemperatureDisplay += "${minTemperature[5]}\n"
            minTemperatureDisplay += "${minTemperature[6]}\n"
            minTemperatureDisplay += "${minTemperature[7]}\n"


            var maxTemperatureDisplay = ""
            maxTemperatureDisplay += "${maxTemperature[0]}\n"
            maxTemperatureDisplay += "${maxTemperature[1]}\n"
            maxTemperatureDisplay += "${maxTemperature[2]}\n"
            maxTemperatureDisplay += "${maxTemperature[3]}\n"
            maxTemperatureDisplay += "${maxTemperature[4]}\n"
            maxTemperatureDisplay += "${maxTemperature[5]}\n"
            maxTemperatureDisplay += "${maxTemperature[6]}\n"
            maxTemperatureDisplay += "${maxTemperature[7]}\n"

            var averagetemperature =
                arrayOf(16, 22, 40, 23, 30, 15, 10, 30, 35, 15, 15, 10, 19, 20)
            averagetemperature = if (day.isNotEmpty()) averagetemperature/day.size
            else
                arrayOf(0)
            averagetemperatureTextView.text = "Average Temperature : $averagetemperature minutes/day"


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
                intent.putStringArrayListExtra("day")
                intent.putStringArrayListExtra("averageTemperature")
                intent.putStringArrayListExtra("WeatherCondition")
                startActivity(intent)
            }
        }
    }
}

private operator fun Any.div(size: Any): Array<Int> {
    return TODO("Provide the return value")
}

private fun <T> Array<T>.add(day: T) {

}
