package com.example.perfilinvest

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioGroup
import androidx.navigation.Navigation

class Pergunta9 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pergunta9, container, false)
        val btnProxima = view.findViewById<Button>(R.id.btnPergunta9)
        val nome = this.activity?.intent?.getStringExtra(NOME_EXTRA)
        val context = this.context
        val resultado = Intent(context, Resultado::class.java)

        val group = view.findViewById<RadioGroup>(R.id.radioGroup9)

        group.setOnCheckedChangeListener { radioGroup, checkedId ->
            if (checkedId == R.id.g9opt1) {
                Perguntas.peso.set(8, 0)
            }
            if (checkedId == R.id.g9opt2) {
                Perguntas.peso.set(8, 1)
            }
            if (checkedId == R.id.g9opt3) {
                Perguntas.peso.set(8, 2)
            }
            if (checkedId == R.id.g9opt4) {
                Perguntas.peso.set(8, 4)
            }
            if (checkedId == R.id.g9opt5) {
                Perguntas.peso.set(8, 5)
            }
        }

        btnProxima.setOnClickListener {
            resultado.putExtra(NOME_EXTRA, nome)
            startActivity(resultado)
        }

        return view
    }
}