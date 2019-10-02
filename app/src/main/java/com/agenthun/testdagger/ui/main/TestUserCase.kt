package com.agenthun.testdagger.ui.main

import android.util.Log

/**
 * @project TestDagger
 * @authors agenthun
 * @date    2019-10-02 17:04.
 */
class TestUserCase {
    fun execute() {
        Log.d(TAG, "execute")
    }

    companion object {
        private val TAG = TestUserCase::class.java.simpleName
    }
}