package com.example.sho.testmvp.singleton

import android.widget.TextView
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Before
import org.junit.Test

class SomePresenterTest {

    private val textView: TextView = mock { }
    private val preferenceManager = mock<PreferenceManagerInterface> { }

    private lateinit var somePresenterWithInterface: SomePresenterWithInterface

    @Before
    fun setUp() {
        somePresenterWithInterface = SomePresenterWithInterface(textView, preferenceManager)
    }

    @Test
    fun solutionWithInterface() {
        whenever(preferenceManager.getHour()).thenReturn(8)
        somePresenterWithInterface.greeting()
        verify(textView).text = "Good Morning"
    }
}