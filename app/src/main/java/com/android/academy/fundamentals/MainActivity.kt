package com.android.academy.fundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.first_activity_text_view)
        textView.setOnClickListener {
            openSecondActivity()
        }
    }

    private fun openSecondActivity() {
        val intent = Intent(this, SecondActivity::class.java)

        //Доп данные
        val transmittedString = "string to transmit"
        intent.putExtra(SecondActivity.TRANSMITTED_STRING, transmittedString)

        val transmittedInt = 12
        intent.putExtra(SecondActivity.TRANSMITTED_INT, transmittedInt)

        val transmittedBool = false
        intent.putExtra(SecondActivity.TRANSMITTED_BOOL, transmittedBool)

        startActivity(intent)
    }
}
