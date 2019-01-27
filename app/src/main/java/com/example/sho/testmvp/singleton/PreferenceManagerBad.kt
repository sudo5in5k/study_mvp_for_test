package com.example.sho.testmvp.singleton

import android.preference.PreferenceManager
import com.example.sho.testmvp.MainActivity

object PreferenceManagerBad {

    private val preferences = PreferenceManager.getDefaultSharedPreferences(
            MainActivity()
    )

    fun getHour(): Int = preferences.getInt("time", 0)
}