package com.example.perfilinvest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iniciarBtn = this.findViewById<Button>(R.id.iniciarBtn)

        iniciarBtn.setOnClickListener {
            val nome = this.findViewById<EditText>(R.id.editNome).text.toString()
            val perguntas = Intent(this, Perguntas::class.java)
            perguntas.putExtra(NOME_EXTRA, nome)
            startActivity(perguntas)
        }
    }
}