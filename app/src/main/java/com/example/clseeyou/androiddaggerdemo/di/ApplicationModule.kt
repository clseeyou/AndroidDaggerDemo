package com.example.clseeyou.androiddaggerdemo.di

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

/**
 * 作者 chenli
 * 日期 2017/11/9
 * 描述 Application Module
 **/
@Module
abstract class ApplicationModule {

    //expose Application as an injectable context
    @Binds
    abstract fun bindContext(application: Application): Context
}