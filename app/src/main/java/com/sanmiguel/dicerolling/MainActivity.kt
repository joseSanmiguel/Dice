    package com.sanmiguel.dicerolling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sanmiguel.dicerolling.databinding.ActivityMainBinding

    class MainActivity : AppCompatActivity() {
        private lateinit var binding: ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
            binding.imaDice.setOnClickListener { newRoll() }

        }

        private fun newRoll(){
            val lado = Die(6)
            val traedor = lado.imaRollDice()
            binding.imaDice.setImageResource(traedor)

        }
    }
