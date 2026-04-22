package com.example.imadasignment2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ReviewAdapter(private val questions: List<Question>) :
    RecyclerView.Adapter<ReviewAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvQuestion: TextView = view.findViewById(R.id.tvReviewQuestion)
        val tvAnswer: TextView = view.findViewById(R.id.tvReviewAnswer)
        val tvExplanation: TextView = view.findViewById(R.id.tvReviewExplanation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_review, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val question = questions[position]
        holder.tvQuestion.text = question.statement
        holder.tvAnswer.text = if (question.isHack) "Type: Hack (True)" else "Type: Myth (False)"
        holder.tvExplanation.text = question.explanation
    }

    override fun getItemCount() = questions.size
}
