package com.agenthun.testdagger.di

import com.agenthun.testdagger.MainApplication
import com.agenthun.testdagger.ui.main.TestUserCaseModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * @project TestDagger
 * @authors agenthun
 * @date    2019-10-02 15:01.
 */
@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ViewModelModule::class,
        ActivityBindingModule::class,
        TestUserCaseModule::class
    ]
)
interface AppComponent : AndroidInjector<MainApplication> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: MainApplication): AppComponent
    }
}