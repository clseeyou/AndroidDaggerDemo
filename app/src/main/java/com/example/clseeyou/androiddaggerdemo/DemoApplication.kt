package com.example.clseeyou.androiddaggerdemo

import android.app.Application
import com.example.clseeyou.androiddaggerdemo.di.*

/**
 * 作者 chenli
 * 日期 2017/11/9
 * 描述 Application
 **/
class DemoApplication : Application() {

    lateinit var netComponent: NetComponent

    override fun onCreate() {
        super.onCreate()

        netComponent = DaggerNetComponent.builder()
                .applicationModule(ApplicationModule(this))
                .netModule(NetModule())
                .build()
    }
}