package com.dany.firstapp

import android.content.Context
import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_base.setOnClickListener {
            var input = nameInput.text.toString()
            if (input.isEmpty()) {
                textView.text = "Please enter a name"
            } else {
                textView.text = "${input.capitalize()}, Happy Birthday to you!"
                it.alpha = 0.5f
            }
        }

        val arrayColors = arrayOf(Color.CYAN, Color.WHITE, Color.MAGENTA, Color.YELLOW, Color.GRAY)

        balloonsId.setOnClickListener{

            // To change the image color (balloons):

            // balloonsId.setColorFilter(arrayColors[getColorsRandom(arrayColors.size)], PorterDuff.Mode.OVERLAY)

            // To change the background color:

            // mainView is added in the file activity_main.xml, this line: android:id="@+id/mainView"
            mainView.setBackgroundColor(arrayColors[getColorsRandom(arrayColors.size)])
       }
    }

    fun getColorsRandom(arraySize: Int): Int{

        var random = Random.nextInt(arraySize)
        return random

    }
}