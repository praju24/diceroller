package com.site.diceroller

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnRoll: Button = findViewById(R.id.btnRoll)

        val ivface: ImageView = findViewById(R.id.ivface)
        val player=MediaPlayer.create(this,R.raw.dicesound)

        btnRoll.setOnClickListener {
            player.start()


            val randomNum = (1..6).random()
            if (randomNum == 1)
            {
                ivface.setImageResource(R.drawable.dice1)
            }
            else if (randomNum == 2)
            {
                ivface.setImageResource(R.drawable.dice2)
            }
            else if (randomNum == 3)
            {
                ivface.setImageResource(R.drawable.dice3)
            }
            else if (randomNum == 4)
            {
                ivface.setImageResource(R.drawable.dice4)
            }
            else if (randomNum == 5)
            {
                ivface.setImageResource(R.drawable.dice5)
            }
            else
            {
                ivface.setImageResource(R.drawable.dice6)
            }


        }
    }
}



