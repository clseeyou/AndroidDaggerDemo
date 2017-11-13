package com.example.clseeyou.androiddaggerdemo.di

import android.content.SharedPreferences
import dagger.Component
import javax.inject.Singleton

/**
 * 作者 chenli
 * 日期 2017/11/10
 * 描述 Net Component
 **/
@Singleton
@Component(modules = arrayOf(NetModule::class, ApplicationModule::class))
interface NetComponent {

    fun getSharedPreferences(): SharedPreferences
}