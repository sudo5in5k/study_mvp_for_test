package com.example.sho.testmvp.singleton

import android.annotation.SuppressLint
import android.widget.TextView

class SomePresenter(private val textView: TextView,
                    private val preferenceManager: PreferenceManagerBad) {

    @SuppressLint("SetTextI18n")
    fun greeting() {
        textView.also {
            when (preferenceManager.getHour()) {
                in 6..11 -> it.text = "Good Morning"
                in 12..17 -> it.text = "Hello"
                in 18..24 -> it.text = "Good Evening"
                else -> it.text = "Hi"
            }
        }
    }
}