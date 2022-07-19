package com.example.my4pmhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollBtn)
        rollButton.setOnClickListener{rollDice()}
    }

    private fun rollDice()
    {
        Toast.makeText(this, "Roll!",Toast.LENGTH_SHORT).show()

        val randomNum=(1..6).random()

        val numberText: TextView = findViewById(R.id.numberTxt)
        numberText.text = randomNum.toString()
        val diceImage : ImageView = findViewById(R.id.diceImage)
        val imgSrc = when (randomNum){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(imgSrc)

        Toast.makeText(this,randomNum.toString(),
            Toast.LENGTH_SHORT).show()

    }
}