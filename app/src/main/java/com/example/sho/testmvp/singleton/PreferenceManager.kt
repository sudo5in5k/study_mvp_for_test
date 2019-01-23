package com.example.sho.testmvp.singleton

import android.preference.PreferenceManager
import com.example.sho.testmvp.MainActivity

object PreferenceManager: PreferenceManagerInterface {

    private val preferences = PreferenceManager.getDefaultSharedPreferences(
            MainActivity::class.java.newInstance().applicationContext
    )

    @Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
    override fun getUserName(): String = preferences.getString("name", "")
}