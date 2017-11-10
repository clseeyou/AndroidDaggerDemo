package com.example.clseeyou.androiddaggerdemo.di

import android.app.Application
import com.example.clseeyou.androiddaggerdemo.DemoApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * 作者 chenli
 * 日期 2017/11/9
 * 描述 Application Component
 **/
@Singleton
@Component(modules = arrayOf(ApplicationModule::class, AndroidSupportInjectionModule::class))
interface AppComponent : AndroidInjector<DaggerApplication> {

    fun inject(application: DemoApplication)

    override fun inject(instance: DaggerApplication?)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun build(): AppComponent
    }
}