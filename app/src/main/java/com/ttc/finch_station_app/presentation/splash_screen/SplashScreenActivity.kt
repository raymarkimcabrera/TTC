package com.ttc.finch_station_app.presentation.splash_screen

import android.content.Intent
import com.ttc.finch_station_app.R
import com.ttc.finch_station_app.base.BaseActivity
import com.ttc.finch_station_app.presentation.dashboard.DashboardActivity
import kotlinx.coroutines.*

class SplashScreenActivity : BaseActivity() {

    private val activityScope = CoroutineScope(Dispatchers.Main)

    override fun getLayoutId(): Int = R.layout.activity_splash_screen

    override fun initializeViews() {
        supportActionBar?.hide()
        startTimer()
    }

    private fun startTimer() {
        activityScope.launch {
            delay(3000)

            val intent = Intent(this@SplashScreenActivity, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onPause() {
        activityScope.cancel()
        super.onPause()
    }
}
