package com.papailleenqueue.rollthedice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var dice_img : ImageView
    lateinit var roll_button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dice_img = findViewById(R.id.dice_img)
        roll_button = findViewById(R.id.roll_button)
        roll_button.setOnClickListener {
            rollTheDice()
        }
    }

    private fun rollTheDice() {
        val dice_res = when (Random.nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        dice_img.setImageResource(dice_res)
    }
}
