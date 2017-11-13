package com.example.clseeyou.androiddaggerdemo.main

import com.example.clseeyou.androiddaggerdemo.BasePresenter
import com.example.clseeyou.androiddaggerdemo.BaseView

/**
 * This specifies the contract between the view and the presenter.
 */
interface MainContract {

    interface View : BaseView {

        val isActive: Boolean

        fun showText(text: String)
    }

    interface Presenter : BasePresenter<View>
}