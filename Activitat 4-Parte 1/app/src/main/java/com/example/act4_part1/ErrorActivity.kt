package com.example.act4_part1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ErrorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_error)

        val username = intent.getStringExtra("nom")  // 👈 Igual aquí
        val chosen = intent.getIntExtra("CHOSEN", -1)
        val correct = intent.getIntExtra("CORRECT", -1)

        val tvMessage = findViewById<TextView>(R.id.tvMessage)
        val btnBack = findViewById<Button>(R.id.btnBack)

        tvMessage.text = "Ho sento, $username :,(\nHas triat $chosen però el número correcte era $correct."

        btnBack.setOnClickListener { finish() }
    }
}

