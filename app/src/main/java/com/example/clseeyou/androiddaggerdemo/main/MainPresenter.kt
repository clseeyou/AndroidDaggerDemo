package com.example.clseeyou.androiddaggerdemo.main

import android.content.SharedPreferences
import com.example.clseeyou.androiddaggerdemo.Constants
import javax.inject.Inject

/**
 * 作者 chenli
 * 日期 2017/11/10
 * 描述 Main Presenter
 **/
class MainPresenter @Inject
constructor(private var sharedPreferences: SharedPreferences, private var view: MainContract.View) : MainContract.Presenter {

    override fun subcribe() {
        view.showText(sharedPreferences.getString(Constants.SP_KEY_TEXT, ""))
    }

    override fun unsubcribe() {
        view.showText("")
    }

    @Inject
    fun setupListeners() {
        view.presenter = this
    }
}