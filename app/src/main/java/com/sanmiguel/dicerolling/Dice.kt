package com.sanmiguel.dicerolling

class Die (val dieSides: Int){

    fun imaRollDice(): Int {
        val lados = when((1..dieSides).random()){
            1-> R.drawable.number_1
            2-> R.drawable.number_2
            3-> R.drawable.number_3
            4-> R.drawable.number_4
            5-> R.drawable.number_5
            6-> R.drawable.number_6
            else -> R.drawable.number_1
        }
        return lados
    }
}

