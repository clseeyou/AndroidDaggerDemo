package com.example.clseeyou.androiddaggerdemo.main

import dagger.Module
import dagger.Provides

/**
 * 作者 chenli
 * 日期 2017/11/13
 * 描述 Main Module
 **/
@Module
class MainModule(private val view: MainContract.View) {

    @Provides
    fun provideMainContractView() = view
}