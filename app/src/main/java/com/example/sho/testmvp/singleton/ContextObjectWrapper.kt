package com.example.sho.testmvp.singleton

import android.content.Context

class ContextObjectWrapper(val context: Context) {

    fun getAppName() = ContextObject.getAppName(context)
}