package com.example.clseeyou.androiddaggerdemo.main

import android.content.SharedPreferences
import com.example.clseeyou.androiddaggerdemo.util.SP_KEY_TEXT
import javax.inject.Inject

/**
 * Listens to user actions from the UI ({@link MainFragment}), retrieves the data and updates
 * the UI as required.
 * <p/>
 * By marking the constructor with {@code @Inject}, Dagger injects the dependencies required to
 * create an instance of the MainPresenter (if it fails, it emits a compiler error). It uses
 * {@link MainModule} to do so.
 * <p/>
 * Dagger generated code doesn't require public access to the constructor or class, and
 * therefore, to ensure the developer doesn't instantiate the class manually and bypasses Dagger,
 * it's good practice minimise the visibility of the class/constructor as much as possible.
 **/
class MainPresenter @Inject
internal constructor(private var sharedPreferences: SharedPreferences) : MainContract.Presenter {

    private var view: MainContract.View? = null

    override fun takeView(view: MainContract.View) {
        this.view = view
        view.showText(sharedPreferences.getString(SP_KEY_TEXT, ""))
    }

    override fun dropView() {
        this.view = null
    }
}