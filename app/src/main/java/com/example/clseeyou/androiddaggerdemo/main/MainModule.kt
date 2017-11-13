package com.example.clseeyou.androiddaggerdemo.main

import com.example.clseeyou.androiddaggerdemo.di.ActivityScoped
import com.example.clseeyou.androiddaggerdemo.di.FragmentScoped
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * This is a Dagger module. We use this to pass in the View dependency to the
 * {@link MainPresenter}.
 */
@Module
abstract class MainModule {

    @FragmentScoped
    @ContributesAndroidInjector
    internal abstract fun mainFragment(): MainFragment

    @ActivityScoped
    @Binds
    internal abstract fun mainPresenter(presenter: MainPresenter): MainContract.Presenter
}