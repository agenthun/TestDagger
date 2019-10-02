package com.agenthun.testdagger.ui.main

import androidx.lifecycle.ViewModel
import com.agenthun.testdagger.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * @project TestDagger
 * @authors agenthun
 * @date    2019-10-02 17:06.
 */
@Module
internal abstract class MainModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    internal abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel
}