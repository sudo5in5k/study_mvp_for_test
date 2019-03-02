package com.example.sho.testmvp.singleton

import android.content.SharedPreferences
import android.widget.TextView
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Before
import org.junit.Test

class SomePresenterBadTest {

    private val textView: TextView = mock()
    private val preferenceManager: PreferenceManagerBad = mock()
    private lateinit var somePresenter: SomePresenter

    private val testMock: SharedPreferences = mock()

    @Before
    fun setUp() {
        whenever(preferenceManager.preferences).thenReturn(testMock)
        somePresenter = SomePresenter(textView, preferenceManager)
    }

    @Test
    fun solutionWithInterface() {
        whenever(preferenceManager.getHour()).thenReturn(2)
        somePresenter.greeting()
        verify(textView).text = "Hi"
    }
}