package com.example.clseeyou.androiddaggerdemo.main

import com.example.clseeyou.androiddaggerdemo.BasePresenter
import com.example.clseeyou.androiddaggerdemo.BaseView

/**
 * 作者 chenli
 * 日期 2017/11/10
 * 描述 MVP-Main Contact
 **/
interface MainContact {

    interface View : BaseView<Presenter> {

        val isActive: Boolean

        fun showText(text: String)
    }

    interface Presenter : BasePresenter
}