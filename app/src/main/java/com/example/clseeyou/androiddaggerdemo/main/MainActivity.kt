package com.example.clseeyou.androiddaggerdemo.main

import android.content.SharedPreferences
import android.os.Bundle
import com.example.clseeyou.androiddaggerdemo.R
import com.example.clseeyou.androiddaggerdemo.util.SP_KEY_TEXT
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

/**
 * Show main UI.
 */
class MainActivity : DaggerAppCompatActivity() {

    @Inject
    internal lateinit var sharedPreferences: SharedPreferences

    @Inject
    internal lateinit var presenter: MainPresenter
    @Inject
    internal lateinit var fragment: MainFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.findFragmentById(R.id.contentFrame) as MainFragment? ?:
                this.fragment.also {
                    supportFragmentManager.beginTransaction().add(R.id.contentFrame, it).commit()
                }

        sharedPreferences.edit().putString(SP_KEY_TEXT, getString(R.string.hello)).apply()
    }
}
