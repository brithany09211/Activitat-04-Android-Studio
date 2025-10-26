package com.example.act4_part1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var botoInicial: Button
    lateinit var editName: EditText
    lateinit var textDate: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botoInicial = findViewById(R.id.botoInicial)
        editName = findViewById(R.id.editName)
        textDate = findViewById(R.id.textDate)

        val dataActual = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(Date())
        textDate.text = "La data actual és: $dataActual"

        botoInicial.setOnClickListener {
            val nomUsuari = editName.text.toString().trim()

            if (nomUsuari.isNotEmpty()) {
                val intent = Intent(this, StartActivity::class.java)
                intent.putExtra("nom", nomUsuari)
                startActivity(intent)
            } else {
                editName.error = "Escriu el teu nom, si us plau"
            }
        }
    }
}
