package com.example.sho.testmvp.singleton

import android.content.Context

object ContextObject {

    fun getAppName(context: Context) = context.packageName
}