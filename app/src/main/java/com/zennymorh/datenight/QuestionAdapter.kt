package com.zennymorh.datenight

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class QuestionAdapter(var questionList: ArrayList<Int>): RecyclerView.Adapter<QuestionAdapter.QuestionViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return QuestionViewHolder(inflater, parent)
    }

    override fun getItemCount(): Int = questionList.size

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {
        var questionId = questionList[position]
        holder.question?.setText(questionId)
    }

    inner class QuestionViewHolder(inflater: LayoutInflater, parent: ViewGroup):
        RecyclerView.ViewHolder(inflater.inflate(R.layout.question_card, parent,
            false)) {
        var question: TextView? = null

        init {
            question = itemView.findViewById(R.id.question)
        }
    }
}