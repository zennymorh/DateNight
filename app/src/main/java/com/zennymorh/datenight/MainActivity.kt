package com.zennymorh.datenight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val questions = arrayListOf(
            R.string.one,
            R.string.two,
            R.string.three,
            R.string.four,
            R.string.five,
            R.string.six,
            R.string.seven,
            R.string.eight,
            R.string.nine,
            R.string.ten,
            R.string.eleven,
            R.string.twelve,
            R.string.thirteen,
            R.string.fourteen,
            R.string.fifteen,
            R.string.sixteen,
            R.string.seventeen,
            R.string.eighteen
        )
        recycler_view.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)

        recycler_view.adapter = QuestionAdapter(questions)
    }
}
