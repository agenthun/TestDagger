package com.agenthun.testdagger.di

import com.agenthun.testdagger.MainActivity
import com.agenthun.testdagger.ui.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * @project TestDagger
 * @authors agenthun
 * @date    2019-10-02 17:14.
 */
@Module
abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(
        modules = [
            MainModule::class
        ]
    )
    internal abstract fun mainActivity(): MainActivity
}