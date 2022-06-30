package com.example.perfilinvest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Perguntas : AppCompatActivity() {

    companion object { var peso = IntArray(9) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas)
    }
}