package com.example.act4_part1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StartActivity : AppCompatActivity() {

    private val correctNumber = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val tvWelcome = findViewById<TextView>(R.id.tvWelcome)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btnBack = findViewById<Button>(R.id.btnBack)

        val username = intent.getStringExtra("nom") ?: "Usuari"

        tvWelcome.text = getString(R.string.welcome_message, username)

        val buttons = listOf(btn1, btn2, btn3)
        for (button in buttons) {
            button.setOnClickListener {
                val chosen = button.text.toString().toInt()
                val next = if (chosen == correctNumber)
                    Intent(this, SuccessActivity::class.java)
                else
                    Intent(this, ErrorActivity::class.java)

                next.putExtra("nom", username)
                next.putExtra("CHOSEN", chosen)
                next.putExtra("CORRECT", correctNumber)
                startActivity(next)
            }
        }

        btnBack.setOnClickListener { finish() }
    }
}
