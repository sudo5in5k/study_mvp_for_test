package com.example.sho.testmvp.singleton

class PreferenceManagerWrapper {
    fun getHour(): Int {
        return PreferenceManagerBad.preferences.getInt("time", 0)
    }
}