package com.example.act4_part1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity : AppCompatActivity() {

    lateinit var botoInicial : Button
    lateinit var editName: EditText
    lateinit var textDate: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Referencies
        botoInicial = findViewById(R.id.botoInicial)
        editName = findViewById(R.id.editName)
        textDate = findViewById(R.id.textDate)

        //Mostrar la data
        val dataActual = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(Date())
        textDate.text = "La data actual és: $dataActual"

        val nomUsuari = editName.text.toString().trim()
        if (nomUsuari.isNotEmpty()) {
            val intent = Intent(this, StartActivity::class.java)
            intent.putExtra("nom", nomUsuari)
            startActivity(intent)
        }
    }
}