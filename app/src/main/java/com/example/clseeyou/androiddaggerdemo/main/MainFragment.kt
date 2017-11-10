package com.example.clseeyou.androiddaggerdemo.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.clseeyou.androiddaggerdemo.R

/**
 * 作者 chenli
 * 日期 2017/11/10
 * 描述 Main Fragment
 **/
class MainFragment : Fragment(), MainContact.View {

    private lateinit var textView: TextView

    override lateinit var presenter: MainContact.Presenter

    override var isActive: Boolean = false
        get() = isAdded

    override fun showText(text: String) {
        textView.text = text
    }

    override fun onResume() {
        super.onResume()
        presenter.subcribe()
    }

    override fun onPause() {
        super.onPause()
        presenter.unsubcribe()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater?.inflate(R.layout.fragment_main, container, false)
        with(root!!) {
            textView = findViewById(R.id.text)
        }

        return root
    }

    companion object {

//        var instance: MainFragment = MainFragment()
//            private set
        fun newInstance() = MainFragment()
    }
}