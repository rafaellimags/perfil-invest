package com.example.perfilinvest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioGroup
import androidx.navigation.Navigation

class Pergunta7 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pergunta7, container, false)
        val btnProxima = view.findViewById<Button>(R.id.btnPergunta7)

        val group = view.findViewById<RadioGroup>(R.id.radioGroup7)

        group.setOnCheckedChangeListener { radioGroup, checkedId ->
            if (checkedId == R.id.g7opt1) {
                Perguntas.peso.set(6, 0)
            }
            if (checkedId == R.id.g7opt2) {
                Perguntas.peso.set(6, 2)
            }
            if (checkedId == R.id.g7opt3) {
                Perguntas.peso.set(6, 3)
            }
            if (checkedId == R.id.g7opt4) {
                Perguntas.peso.set(6, 4)
            }
        }

        btnProxima.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_pergunta7_to_pergunta8)
        }

        return view
    }
}