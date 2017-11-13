package com.example.clseeyou.androiddaggerdemo.di

import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * 作者 chenli
 * 日期 2017/11/9
 * 描述 Application Module
 **/
@Module
class ApplicationModule(private val context: Context) {

    @Provides
    fun provideContext(): Context = context
}