package com.agenthun.testdagger.di

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

/**
 * @project TestDagger
 * @authors agenthun
 * @date    2019-10-02 16:00.
 */
@Module
abstract class ViewModelModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}