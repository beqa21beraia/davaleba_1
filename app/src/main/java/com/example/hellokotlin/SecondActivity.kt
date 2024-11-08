package com.example.mobileApplications

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.hellokotlin.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textViewNumber = findViewById<TextView>(R.id.textViewNumber)
        val buttonClick = findViewById<Button>(R.id.buttonClick)

        var number = 0
        textViewNumber.text = number.toString()

        buttonClick.setOnClickListener {
            number -= 1
            textViewNumber.text = number.toString()
        }
    }
}