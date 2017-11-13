package com.example.clseeyou.androiddaggerdemo.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.clseeyou.androiddaggerdemo.R
import dagger.android.support.DaggerFragment
import javax.inject.Inject

/**
 * Main UI for the main screen.
 */
class MainFragment @Inject
constructor() : DaggerFragment(), MainContract.View {

    private lateinit var textView: TextView

    @Inject
    internal lateinit var presenter: MainContract.Presenter

    override var isActive: Boolean = false
        get() = isAdded

    override fun showText(text: String) {
        textView.text = text
    }

    override fun onResume() {
        super.onResume()
        presenter.takeView(this)
    }

    override fun onPause() {
        super.onPause()
        presenter.dropView()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_main, container, false)
        with(root) {
            textView = findViewById(R.id.text)
        }

        return root
    }
}