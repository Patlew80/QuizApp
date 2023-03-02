package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class ChooseQuizActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_quiz)

        val cardView1 = findViewById<CardView>(R.id.card_view_1)
        cardView1.setOnClickListener {
            onCardClick1(it.id)
        }

    }

    fun onCardClick1(viewId: Int) {
        when (viewId) {
            R.id.card_view_1 -> {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                startActivity(intent)
            }

            // dodaj obsługę pozostałych kafelków
            // ...
        }
    }
}