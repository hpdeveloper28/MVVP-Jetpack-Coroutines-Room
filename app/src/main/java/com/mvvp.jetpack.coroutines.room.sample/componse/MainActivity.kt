package com.mvvp.jetpack.coroutines.room.sample.componse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appdynamic.sample.R
import com.mvvp.jetpack.coroutines.room.sample.ui.componse.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}