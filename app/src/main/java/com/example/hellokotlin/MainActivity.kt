package com.example.hellokotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.hellokotlin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editTextNumber)
        val textView = findViewById<TextView>(R.id.textViewDisplay)
        val buttonOkay = findViewById<Button>(R.id.buttonOkay)
        val buttonNext = findViewById<Button>(R.id.buttonNext)

        buttonOkay.setOnClickListener {
            val enteredNumber = editText.text.toString()
            textView.text = "your number is $enteredNumber"
        }

        buttonNext.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}