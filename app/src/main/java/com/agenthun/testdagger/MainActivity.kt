package com.agenthun.testdagger

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.agenthun.testdagger.ui.main.MainFragment
import com.agenthun.testdagger.ui.main.MainViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
        viewModel.doSomething()
    }

}
