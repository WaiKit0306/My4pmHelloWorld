package com.example.my4pmhelloworld

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.databinding.DataBindingUtil
import com.example.my4pmhelloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    lateinit var  diceImg :ImageView
//    lateinit var  numbText: TextView
//    lateinit var  nameText: EditText
//    lateinit var  playerNameTxt: TextView

    lateinit var binding:ActivityMainBinding
    private val  gameInfo: GameInfo = GameInfo("Sek","0")
    private var totalScore : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
//        setContentView(R.layout.activity_main)
//        diceImg = findViewById(R.id.diceImage)
//        numbText = findViewById(R.id.numberTxt)
//        nameText = findViewById(R.id.editPlayerNameET)
//        playerNameTxt= findViewById(R.id.playerName)

//        val rollButton: Button = findViewById(R.id.rollBtn)
//        rollButton.setOnClickListener{rollDice()}
//        val updateBtn: Button = findViewById(R.id.updateButton)
//        updateBtn.setOnClickListener{updateName(it)} //instance

        binding.rollBtn.setOnClickListener{rollDice()}
        binding.updateButton.setOnClickListener{updateName(it)}
    }

    private fun updateName(view:View)
    {
        binding.apply {
            binding.gameInfo?.playerName = editPlayerNameET.text.toString()
            invalidateAll()
        }



//        binding.playerName.text = binding.editPlayerNameET.text
//
//        binding.editPlayerNameET.text.clear()
//        binding.playerName.clearFocus()
//
//        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//        imm.hideSoftInputFromWindow(view.windowToken,0)
    }




    private fun rollDice()
    {
//        Toast.makeText(this, "Roll!",Toast.LENGTH_SHORT).show()
//
//        val randomNum=(1..6).random()
//
//        val numberText: TextView = findViewById(R.id.numberTxt)
//        numberText.text = randomNum.toString()
//        val diceImage : ImageView = findViewById(R.id.diceImage)
//        val imgSrc = when (randomNum){
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
//        }
//
//        diceImage.setImageResource(imgSrc)
//
//        Toast.makeText(this,randomNum.toString(),
//            Toast.LENGTH_SHORT).show()

        Toast.makeText(this, "Roll!",Toast.LENGTH_SHORT).show()

        val randomNum=(1..6).random()

        val numberText: TextView = findViewById(R.id.numberTxt)
        binding.numberTxt.text= randomNum.toString()
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