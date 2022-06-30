package com.example.perfilinvest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioGroup
import androidx.navigation.Navigation

class Pergunta6 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pergunta6, container, false)
        val btnProxima = view.findViewById<Button>(R.id.btnPergunta6)

        val group = view.findViewById<RadioGroup>(R.id.radioGroup6)

        group.setOnCheckedChangeListener { radioGroup, checkedId ->
            if (checkedId == R.id.g6opt1) {
                Perguntas.peso.set(5, 0)
            }
            if (checkedId == R.id.g6opt2) {
                Perguntas.peso.set(5, 2)
            }
            if (checkedId == R.id.g6opt3) {
                Perguntas.peso.set(5, 3)
            }
            if (checkedId == R.id.g6opt4) {
                Perguntas.peso.set(5, 4)
            }
        }

        btnProxima.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_pergunta6_to_pergunta7)
        }
        return view
    }
}