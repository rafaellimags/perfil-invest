package com.example.perfilinvest

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.navigation.Navigation

class Pergunta1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_pergunta1, container, false)
        val btn = view.findViewById<Button>(R.id.btnPergunta1)
        val group = view.findViewById<RadioGroup>(R.id.radioGroup1)

        group.setOnCheckedChangeListener { radioGroup, checkedId ->
            if (checkedId == R.id.opt1) {
                Perguntas.peso.set(0, 0)
            }
            if (checkedId == R.id.opt2) {
                Perguntas.peso.set(0, 2)
            }
            if (checkedId == R.id.opt3) {
                Perguntas.peso.set(0, 3)
            }
            if (checkedId == R.id.opt4) {
                Perguntas.peso.set(0, 4)
            }
        }

        btn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_pergunta1_to_pergunta2)
        }

        return view
    }
}