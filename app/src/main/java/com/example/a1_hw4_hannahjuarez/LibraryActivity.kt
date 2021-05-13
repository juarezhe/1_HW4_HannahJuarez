package com.example.a1_hw4_hannahjuarez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LibraryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        findViewById<Button>(R.id.button_library_back).setOnClickListener {
            this.finish()
        }
    }
}