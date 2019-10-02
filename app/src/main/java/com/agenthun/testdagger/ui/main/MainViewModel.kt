package com.agenthun.testdagger.ui.main

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(private val testUserCase: TestUserCase) : ViewModel() {
    fun doSomething() {
        testUserCase.execute()
    }
}
