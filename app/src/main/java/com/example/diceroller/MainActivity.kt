package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

/**
 * This activity allows the user to roll a dice and view the
 * result on the screen
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.buttonfred)
        rollButton.setOnClickListener {
            //val toast = Toast.makeText(this, "Dice Rolled",Toast.LENGTH_SHORT).show()

            rollDice()
        }
    }

    /**
     * Roll the dice and update the screen with the result
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceRoll2 = dice.roll()



        val diceImage: ImageView = findViewById(R.id.imageView)
        val diceImage2: ImageView = findViewById(R.id.imageView2)

        val drawableResource = when(diceRoll){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4

            5 -> R.drawable.dice_5

            else -> R.drawable.dice_6

        }
        /*
        hola
        */


        val drawableResource2 = when(diceRoll2){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4

            5 -> R.drawable.dice_5

            else -> R.drawable.dice_6

        }


        diceImage.setImageResource(drawableResource)

        diceImage.contentDescription = diceRoll.toString()

        diceImage2.setImageResource(drawableResource2)

        diceImage2.contentDescription = diceRoll2.toString()




    }

    class Dice(val nunSides:Int) {
        fun roll(): Int {
            return (1..nunSides).random()
        }
    }

}