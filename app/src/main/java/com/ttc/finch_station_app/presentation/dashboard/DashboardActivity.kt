package com.ttc.finch_station_app.presentation.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.ttc.finch_station_app.R
import com.ttc.finch_station_app.base.BaseActivity
import com.ttc.finch_station_app.viewmodel.DashboardViewModel

class DashboardActivity : BaseActivity() {
    private val dashboardViewModel: DashboardViewModel by viewModels{viewModelFactory}
    override fun getLayoutId(): Int = R.layout.activity_dashboard

    override fun initializeViews() {
        dashboardViewModel.getFinchStationDetails()
    }
}