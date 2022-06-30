package com.example.perfilinvest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val nome = intent.getStringExtra(NOME_EXTRA)

        val res: TextView = this.findViewById<EditText>(R.id.resultadoEdt) as TextView
        val txtPerfil = this.findViewById<EditText>(R.id.txtResultadoPerfil) as TextView
        val btnRefazer = this.findViewById<Button>(R.id.btnRefazer)

        var total = Perguntas.peso.sum()

        res.text = nome

        if (total < 13) {
            txtPerfil.text = CONSERVADOR
        }
        if (total >= 13 && total <=29) {
            txtPerfil.text = MODERADO
        }
        if (total > 29) {
            txtPerfil.text = ARROJADO
        }

        btnRefazer.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}