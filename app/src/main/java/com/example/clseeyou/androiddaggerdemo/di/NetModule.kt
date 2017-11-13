package com.example.clseeyou.androiddaggerdemo.di

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * 作者 chenli
 * 日期 2017/11/10
 * 描述 Net Module
 **/
@Module
class NetModule {

    @Singleton
    @Provides
    fun provideSharePreferences(context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }
}