package com.example.act4_part1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SuccessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        val username = intent.getStringExtra("nom")
        val chosen = intent.getIntExtra("CHOSEN", -1)
        val correct = intent.getIntExtra("CORRECT", -1)

        val tvMessage = findViewById<TextView>(R.id.tvMessage)
        val btnBack = findViewById<Button>(R.id.btnBack)

        tvMessage.text = "Felicitats, $username :)\nHas triat $chosen i el número correcte era $correct"

        btnBack.setOnClickListener { finish() }
    }
}

