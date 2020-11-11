package com.example.android.dicerolle2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView



class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    lateinit var diceImage2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)

        val rollButton: Button = findViewById(R.id.roll_button)


        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())

    }

    private fun getRandomDiceImage(): Int {
        val randomInt = (1..6).random()
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        return drawableResource
    }
}
