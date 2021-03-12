package com.dany.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

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
    }
}