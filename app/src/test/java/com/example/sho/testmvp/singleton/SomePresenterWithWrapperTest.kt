package com.example.sho.testmvp.singleton

import android.widget.TextView
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Before
import org.junit.Test

class SomePresenterWithWrapperTest {

    private val textView: TextView = mock { }
    private val prefWrapper = mock<PreferenceManagerWrapper>()
    private lateinit var somePresenterWithWrapper: SomePresenterWithWrapper

    @Before
    fun setUp() {
        somePresenterWithWrapper = SomePresenterWithWrapper(textView, prefWrapper)
    }

    @Test
    fun solutionWithWrapper() {
        whenever(prefWrapper.getHour()).thenReturn(2)
        somePresenterWithWrapper.greeting()
        verify(textView).text = "Hi"
    }
}