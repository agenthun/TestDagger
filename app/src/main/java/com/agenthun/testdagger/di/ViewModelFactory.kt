package com.agenthun.testdagger.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider

/**
 * @project TestDagger
 * @authors agenthun
 * @date    2019-10-02 15:56.
 */
class ViewModelFactory @Inject constructor(private val creators: @JvmSuppressWildcards Map<Class<out ViewModel>, Provider<ViewModel>>) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val found = creators.entries.find { modelClass.isAssignableFrom(it.key) }
        val creator =
            found?.value ?: throw IllegalArgumentException("unknown model class $modelClass")
        try {
            @Suppress("UNCHECKED_CAST")
            return creator.get() as T
        } catch (e: Exception) {
            e.printStackTrace()
            throw RuntimeException(e)
        }
    }
}