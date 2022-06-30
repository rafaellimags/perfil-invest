package com.example.perfilinvest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioGroup
import androidx.navigation.Navigation

class Pergunta2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_pergunta2, container, false)
        val btnProxima = view.findViewById<Button>(R.id.btnPergunta2)
        val group = view.findViewById<RadioGroup>(R.id.radioGroup2)

        group.setOnCheckedChangeListener { radioGroup, checkedId ->
            if (checkedId == R.id.g2opt1) {
                Perguntas.peso.set(1, 0)
            }
            if (checkedId == R.id.g2opt2) {
                Perguntas.peso.set(1, 2)
            }
            if (checkedId == R.id.g2opt3) {
                Perguntas.peso.set(1, 4)
            }
            if (checkedId == R.id.g2opt4) {
                Perguntas.peso.set(1, 5)
            }
        }

        btnProxima.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_pergunta2_to_pergunta3)
        }
        return view
    }
}