package com.example.clseeyou.androiddaggerdemo.di

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * This is used by Dagger to inject the required arguments into the {@link SharedPreferences}.
 */
@Module
class NetModule {

    @Singleton
    @Provides
    fun provideSharePreferences(context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }
}