package com.example.sho.testmvp.singleton

import android.widget.TextView
import com.example.sho.testmvp.statics.Greeting

class SomePresenterWithInterface(private val textView: TextView,
                                 private val preference: PreferenceManagerInterface = PreferenceManagerWithInterface) {

    fun greeting() {
        Greeting.invoke(textView, preference.getHour())
    }

}