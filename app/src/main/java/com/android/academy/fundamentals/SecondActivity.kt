package com.android.academy.fundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var transmittedString: String? = intent.getStringExtra(TRANSMITTED_STRING)
        var transmittedInt: Int = intent.getIntExtra(TRANSMITTED_INT, -1)
        val transmittedBool : Boolean = intent.getBooleanExtra(TRANSMITTED_BOOL, false)

        val textView: TextView = findViewById(R.id.second_activity_text_view)
        textView.text = "Данные переданы с предыдущего экрана: transmittedString: $transmittedString, transmittedInt: $transmittedInt, transmittedBoolean: $transmittedBool"
    }

    companion object {
        const val TRANSMITTED_STRING= "transmittedString"
        const val TRANSMITTED_INT = "transmittedInt"
        const val TRANSMITTED_BOOL = "transmittedBool"
    }
}