package com.example.flashcardapp

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val parentLayout = findViewById<RelativeLayout>(R.id.parent_layout)

        val flashcardAnswer1 = findViewById<TextView>(R.id.flashcard_answer1)
        val flashcardAnswer2 = findViewById<TextView>(R.id.flashcard_answer2)
        val flashcardAnswer3 = findViewById<TextView>(R.id.flashcard_answer3)

        val eyesOffFilled = findViewById<ImageView>(R.id.eyes_off_filled)
        val eyesFilled = findViewById<ImageView>(R.id.eyes_filled)


        flashcardAnswer1.setOnClickListener {
            flashcardAnswer1.setBackgroundColor(getResources().getColor(R.color.red, null))
            flashcardAnswer3.setBackgroundColor(getResources().getColor(R.color.green, null))
        }

        flashcardAnswer2.setOnClickListener {
            flashcardAnswer2.setBackgroundColor(getResources().getColor(R.color.red, null))
            flashcardAnswer3.setBackgroundColor(getResources().getColor(R.color.green, null))
        }

        flashcardAnswer3.setOnClickListener {
            flashcardAnswer3.setBackgroundColor(getResources().getColor(R.color.green, null))
        }

        eyesOffFilled.setOnClickListener {
            eyesOffFilled.visibility = View.INVISIBLE
            eyesFilled.visibility = View.VISIBLE
            flashcardAnswer1.visibility = View.GONE
            flashcardAnswer2.visibility = View.GONE
            flashcardAnswer3.visibility = View.GONE
        }

        eyesFilled.setOnClickListener {
            eyesOffFilled.visibility = View.VISIBLE
            eyesFilled.visibility = View.INVISIBLE
            flashcardAnswer1.visibility = View.VISIBLE
            flashcardAnswer2.visibility = View.VISIBLE
            flashcardAnswer3.visibility = View.VISIBLE
        }

        parentLayout.setOnClickListener(View.OnClickListener { // Reset colors of the TextViews
            flashcardAnswer1.setBackgroundColor(getResources().getColor(R.color.grown))
            flashcardAnswer2.setBackgroundColor(getResources().getColor(R.color.grown))
            flashcardAnswer3.setBackgroundColor(getResources().getColor(R.color.grown))
        })

    }

}