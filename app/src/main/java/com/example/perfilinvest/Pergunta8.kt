package com.example.perfilinvest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioGroup
import androidx.navigation.Navigation

class Pergunta8 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pergunta8, container, false)
        val btnProxima = view.findViewById<Button>(R.id.btnPergunta8)

        val group = view.findViewById<RadioGroup>(R.id.radioGroup8)

        group.setOnCheckedChangeListener { radioGroup, checkedId ->
            if (checkedId == R.id.g8opt1) {
                Perguntas.peso.set(7, 0)
            }
            if (checkedId == R.id.g8opt2) {
                Perguntas.peso.set(7, 1)
            }
            if (checkedId == R.id.g8opt3) {
                Perguntas.peso.set(7, 2)
            }
            if (checkedId == R.id.g8opt4) {
                Perguntas.peso.set(7, 4)
            }
        }

        btnProxima.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_pergunta8_to_pergunta9)
        }

        return view
    }
}