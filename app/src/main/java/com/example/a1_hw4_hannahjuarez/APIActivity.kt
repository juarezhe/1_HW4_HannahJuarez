package com.example.a1_hw4_hannahjuarez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class APIActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_api)

        findViewById<Button>(R.id.button_api_back).setOnClickListener {
            this.finish()
        }
    }
}