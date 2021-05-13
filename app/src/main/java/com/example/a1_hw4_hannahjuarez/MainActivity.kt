package com.example.a1_hw4_hannahjuarez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_api).setOnClickListener {
            startActivity(
                Intent(this, APIActivity::class.java)
            )
        }
        findViewById<Button>(R.id.button_library).setOnClickListener {
            startActivity(
                Intent(this, PermissionActivity::class.java)
            )
        }
        findViewById<Button>(R.id.button_permission).setOnClickListener {
            startActivity(
                Intent(this, LibraryActivity::class.java)
            )
        }
    }
}