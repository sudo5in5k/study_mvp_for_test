package com.example.sho.testmvp.singleton

import android.preference.PreferenceManager
import com.example.sho.testmvp.MainActivity

object PreferenceManagerWithInterface: PreferenceManagerInterface {

    private val preferences = PreferenceManager.getDefaultSharedPreferences(
            MainActivity()
    )

    override fun getHour(): Int = preferences.getInt("time", 0)
}