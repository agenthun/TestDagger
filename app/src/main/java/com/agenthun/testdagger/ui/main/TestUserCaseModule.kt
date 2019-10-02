package com.agenthun.testdagger.ui.main

import dagger.Module
import dagger.Provides

/**
 * @project TestDagger
 * @authors agenthun
 * @date    2019-10-02 17:26.
 */
@Module
class TestUserCaseModule {
    @Provides
    fun provideTestUserCase(): TestUserCase = TestUserCase()
}