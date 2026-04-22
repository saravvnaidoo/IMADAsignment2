package com.example.imadasignment2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Manages the quiz session by iterating through a list of hack/myth flashcards.
 * Handles user input, provides immediate feedback, and tracks the score.
 */
class QuestionActivity : AppCompatActivity() {

    // UI Component References
    private lateinit var tvProgress: TextView
    private lateinit var tvQuestion: TextView
    private lateinit var tvFeedback: TextView
    private lateinit var btnHack: Button
    private lateinit var btnMyth: Button
    private lateinit var btnNext: Button

    // Session Data
    private val questions = QuestionRepository.getQuestions()
    private var currentQuestionIndex = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        // Bind UI components
        tvProgress = findViewById(R.id.tvQuestionProgress)
        tvQuestion = findViewById(R.id.tvQuestionText)
        tvFeedback = findViewById(R.id.tvFeedback)
        btnHack = findViewById(R.id.btnHack)
        btnMyth = findViewById(R.id.btnMyth)
        btnNext = findViewById(R.id.btnNext)

        // Initialize first question
        displayQuestion()

        // Button listeners for user answers
        btnHack.setOnClickListener { checkAnswer(true) }
        btnMyth.setOnClickListener { checkAnswer(false) }
        
        // Listener for navigating to the next card or final results
        btnNext.setOnClickListener {
            currentQuestionIndex++
            if (currentQuestionIndex < questions.size) {
                displayQuestion()
            } else {
                // All questions answered, transition to score screen
                val intent = Intent(this, ScoreActivity::class.java)
                intent.putExtra("SCORE", score)
                intent.putExtra("TOTAL", questions.size)
                startActivity(intent)
                finish()
            }
        }
    }

    /**
     * Updates the UI with the current question details and resets feedback states.
     */
    private fun displayQuestion() {
        val currentQuestion = questions[currentQuestionIndex]
        tvProgress.text = getString(R.string.progress_format, currentQuestionIndex + 1, questions.size)
        tvQuestion.text = currentQuestion.statement
        
        // Reset visibility and interactivity for the new question
        tvFeedback.visibility = View.INVISIBLE
        btnNext.visibility = View.GONE
        btnHack.isEnabled = true
        btnMyth.isEnabled = true
    }

    /**
     * Checks if the user's answer matches the fact.
     * Updates the score and provides visual feedback.
     *
     * @param userAnswer The user's choice: true for 'Hack', false for 'Myth'.
     */
    private fun checkAnswer(userAnswer: Boolean) {
        val currentQuestion = questions[currentQuestionIndex]
        
        // Prevent multiple answers for the same question
        btnHack.isEnabled = false
        btnMyth.isEnabled = false

        if (userAnswer == currentQuestion.isHack) {
            score++
            tvFeedback.text = getString(R.string.correct_feedback)
            // Use Green for success
            tvFeedback.setTextColor(getColor(R.color.theme_green))
        } else {
            tvFeedback.text = getString(R.string.wrong_feedback)
            // Use Red for correction
            tvFeedback.setTextColor(getColor(R.color.theme_red))
        }

        // Show feedback message and 'Next' button
        tvFeedback.visibility = View.VISIBLE
        btnNext.visibility = View.VISIBLE
    }
}
