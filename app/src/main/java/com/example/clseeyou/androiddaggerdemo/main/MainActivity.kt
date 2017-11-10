package com.example.clseeyou.androiddaggerdemo.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.clseeyou.androiddaggerdemo.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fragment = supportFragmentManager.findFragmentById(R.id.contentFrame) as MainFragment? ?:
                MainFragment.newInstance().also {
                    supportFragmentManager.beginTransaction().add(R.id.contentFrame, it).commit()
                }

        // Create the presenter
        MainPresenter(fragment)
    }
}
