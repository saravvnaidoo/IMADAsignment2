package com.example.imadasignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Displays the final results of the quiz.
 * Calculates performance and provides personalized feedback to the user.
 */
class ScoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        // Retrieve score data from the intent
        val score = intent.getIntExtra("SCORE", 0)
        val total = intent.getIntExtra("TOTAL", 10)

        // Bind UI components
        val tvFinalScore = findViewById<TextView>(R.id.tvFinalScore)
        val tvFeedback = findViewById<TextView>(R.id.tvPersonalizedFeedback)
        val btnReview = findViewById<Button>(R.id.btnReview)
        val btnRestart = findViewById<Button>(R.id.btnRestart)

        // Display the formatted score
        tvFinalScore.text = getString(R.string.score_format, score, total)

        // Provide personalized encouragement based on the percentage correct
        tvFeedback.text = when {
            score == total -> getString(R.string.feedback_master)
            score >= total / 2 -> getString(R.string.feedback_great)
            else -> getString(R.string.feedback_safe)
        }

        // Navigate to the Review screen to study the answers
        btnReview.setOnClickListener {
            val intent = Intent(this, ReviewActivity::class.java)
            startActivity(intent)
        }

        // Restart the quiz by returning to the Welcome screen
        btnRestart.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            // Clear the activity stack so 'Back' doesn't return to the score screen
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
            finish()
        }
    }
}
