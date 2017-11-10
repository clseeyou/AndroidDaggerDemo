package com.example.clseeyou.androiddaggerdemo.main

/**
 * 作者 chenli
 * 日期 2017/11/10
 * 描述 TODO
 **/
class MainPresenter(private val view: MainContact.View) : MainContact.Presenter {

    init {
        view.presenter = this
    }

    override fun subcribe() {
        view.showText("Hello World")
    }

    override fun unsubcribe() {
        view.showText("")
    }
}