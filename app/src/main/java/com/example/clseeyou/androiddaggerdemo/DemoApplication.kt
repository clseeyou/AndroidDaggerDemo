package com.example.clseeyou.androiddaggerdemo

import android.content.SharedPreferences
import android.support.annotation.VisibleForTesting
import com.example.clseeyou.androiddaggerdemo.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Inject

/**
 * We create a custom {@link Application} class that extends  {@link DaggerApplication}.
 * We then override applicationInjector() which tells Dagger how to make our @Singleton Component
 * We never have to call `component.inject(this)` as {@link DaggerApplication} will do that for us.
 */
class DemoApplication : DaggerApplication() {

//    /**
//     * Our Espresso tests need to be able to get an instance of the [SharedPreferences]
//     * so that we can delete all tasks before running each test
//     */
//    @get:VisibleForTesting
//    @Inject
//    lateinit var sharedPreferences: SharedPreferences
//        internal set

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val appComponent = DaggerAppComponent.builder().application(this).build()
        appComponent.inject(this)
        return appComponent
    }
}