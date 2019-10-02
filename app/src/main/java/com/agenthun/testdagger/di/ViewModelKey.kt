package com.agenthun.testdagger.di

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

/**
 * @project TestDagger
 * @authors agenthun
 * @date    2019-10-02 17:02.
 */
@Target(
    AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)