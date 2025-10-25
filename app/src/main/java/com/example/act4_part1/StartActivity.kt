package com.example.act4_part1

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        val numCorrecte = Random.next
        //nom de classe Main intent para el nom
        var intentpassat = this.intent
        var nom = intentpassat.getStringExtra("nom")

        var txtnom = findViewById<TextView>(R.id.txtnom)
        txtnom.text = nom
    }
}