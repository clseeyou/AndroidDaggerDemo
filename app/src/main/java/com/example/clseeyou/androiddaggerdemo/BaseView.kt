package com.example.clseeyou.androiddaggerdemo

/**
 * 作者 chenli
 * 日期 2017/11/10
 * 描述 MVP-Base View
 **/
interface BaseView<T> {

    var presenter: T

}