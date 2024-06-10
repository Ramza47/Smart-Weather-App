package com.example.smartweatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class DetailedViewActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)

        val day = intent.getStringArrayListExtra("day") ?: arrayListOf()
        val averageTemperature =
            intent.getIntegerArrayListExtra("averagetemperature") ?: arrayListOf()

        val detailsTextView = findViewById<TextView>(R.id.detailsTextView)
        val averageTemperatureTextView = findViewById<TextView>(R.id.averageTemperatureTextView)
        val backButton = findViewById<Button>(R.id.backButton)

        var displayText = ""
        for (i in day.indices) {
            val minTemperature = arrayOf<Int>(16, 22, 40, 23, 30, 15, 10)
            val maxTemperature = arrayOf<Int>(30, 35, 15, 15, 10, 19, 20)
            val dailyScreen = minTemperature[i] + maxTemperature[i]

            detailsTextView.text = displayText
            averageTemperatureTextView.text = "Average Temperature: $averageTemperature/size"

            backButton.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}