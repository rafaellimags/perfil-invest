package com.example.perfilinvest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioGroup
import androidx.navigation.Navigation

class Pergunta3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pergunta3, container, false)
        val btnProxima = view.findViewById<Button>(R.id.btnPergunta3)
        val group = view.findViewById<RadioGroup>(R.id.radioGroup3)

        group.setOnCheckedChangeListener { radioGroup, checkedId ->
            if (checkedId == R.id.g3opt1) {
                Perguntas.peso.set(2, 0)
            }
            if (checkedId == R.id.g3opt2) {
                Perguntas.peso.set(2, 1)
            }
            if (checkedId == R.id.g3opt3) {
                Perguntas.peso.set(2, 2)
            }
            if (checkedId == R.id.g3opt4) {
                Perguntas.peso.set(2, 4)
            }
        }

        btnProxima.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_pergunta3_to_pergunta4)
        }

        return view
    }
}