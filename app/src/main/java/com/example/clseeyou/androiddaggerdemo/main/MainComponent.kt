package com.example.clseeyou.androiddaggerdemo.main

import com.example.clseeyou.androiddaggerdemo.di.FragmentScoped
import com.example.clseeyou.androiddaggerdemo.di.NetComponent
import dagger.Component

/**
 * 作者 chenli
 * 日期 2017/11/13
 * 描述 Main Component
 **/
@FragmentScoped
@Component(dependencies = arrayOf(NetComponent::class), modules = arrayOf(MainModule::class))
interface MainComponent {

    fun inject(activity: MainActivity)
}