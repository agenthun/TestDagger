package com.agenthun.testdagger

import com.agenthun.testdagger.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/**
 * @project TestDagger
 * @authors agenthun
 * @date    2019-09-16 00:27.
 */
class MainApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }
}