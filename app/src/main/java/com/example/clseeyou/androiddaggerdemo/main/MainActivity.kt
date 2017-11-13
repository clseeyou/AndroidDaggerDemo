package com.example.clseeyou.androiddaggerdemo.main

import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.clseeyou.androiddaggerdemo.Constants
import com.example.clseeyou.androiddaggerdemo.DemoApplication
import com.example.clseeyou.androiddaggerdemo.R
import com.example.clseeyou.androiddaggerdemo.di.FragmentScoped
import javax.inject.Inject

@FragmentScoped
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = supportFragmentManager.findFragmentById(R.id.contentFrame) as MainFragment? ?:
                MainFragment.newInstance().also {
                    supportFragmentManager.beginTransaction().add(R.id.contentFrame, it).commit()
                }

        // Create the presenter
        DaggerMainComponent.builder()
                .mainModule(MainModule(fragment))
                .netComponent((application as DemoApplication).netComponent)
                .build()
                .inject(this)

        sharedPreferences.edit().putString(Constants.SP_KEY_TEXT, getString(R.string.hello)).apply()
    }
}
