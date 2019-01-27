package com.example.sho.testmvp.statics

import android.annotation.SuppressLint
import android.widget.TextView

object Greeting {

    @SuppressLint("SetTextI18n")
    fun invoke(textView: TextView, hour: Int) {
        textView.also {
            when(hour) {
                in 6..11 ->  it.text = "Good Morning"
                in 12..17 -> it.text = "Hello"
                in 18..24 -> it.text = "Good Evening"
                else -> it.text = "Hi"
            }
        }
    }
}