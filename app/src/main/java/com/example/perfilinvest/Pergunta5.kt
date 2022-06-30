package com.example.perfilinvest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioGroup
import androidx.navigation.Navigation

class Pergunta5 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pergunta5, container, false)
        val btnProxima = view.findViewById<Button>(R.id.btnPergunta5)

        val group = view.findViewById<RadioGroup>(R.id.radioGroup5)

        group.setOnCheckedChangeListener { radioGroup, checkedId ->
            if (checkedId == R.id.g5opt1) {
                Perguntas.peso.set(4, 0)
            }
            if (checkedId == R.id.g5opt2) {
                Perguntas.peso.set(4, 2)
            }
            if (checkedId == R.id.g5opt3) {
                Perguntas.peso.set(4, 4)
            }
        }

        btnProxima.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_pergunta5_to_pergunta6)
        }

        return view
    }
}