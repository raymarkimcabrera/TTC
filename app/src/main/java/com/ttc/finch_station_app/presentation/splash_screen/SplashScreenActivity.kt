package com.ttc.finch_station_app.presentation.splash_screen

import android.content.Intent
import com.ttc.finch_station_app.R
import com.ttc.finch_station_app.base.BaseActivity
import com.ttc.finch_station_app.presentation.dashboard.DashboardActivity
import java.util.*
import kotlin.concurrent.schedule

class SplashScreenActivity : BaseActivity() {
    var timer = Timer()

    override fun getLayoutId(): Int = R.layout.activity_splash_screen

    override fun initializeViews() {
        supportActionBar?.hide()
        startTimer()
    }

    private fun startTimer() {
        timer.schedule(3000) {
            val intent = Intent(this@SplashScreenActivity, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onPause() {
        timer.cancel()
        super.onPause()
    }
}
