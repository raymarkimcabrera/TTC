package com.ttc.finch_station_app.presentation.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.ttc.finch_station_app.R
import com.ttc.finch_station_app.base.BaseActivity
import com.ttc.finch_station_app.extensions.hide
import com.ttc.finch_station_app.extensions.show
import com.ttc.finch_station_app.model.local.Stop
import com.ttc.finch_station_app.presentation.dashboard.adapter.StopsAdapter
import com.ttc.finch_station_app.viewmodel.DashboardViewModel
import kotlinx.android.synthetic.main.activity_dashboard.*

fun MutableList<Stop>.sortByRouteList(): MutableList<Stop> {
    val temp = this
    temp.sortByDescending {
        it.routes?.size
    }
    return temp
}

class DashboardActivity : BaseActivity() {

    private val stopsAdapter = StopsAdapter(subscriptionsWhileInMemory, mutableListOf())

    private val dashboardViewModel: DashboardViewModel by viewModels { viewModelFactory }
    override fun getLayoutId(): Int = R.layout.activity_dashboard

    override fun initializeViews() {
        rv_stop_list.adapter = stopsAdapter
        dashboardViewModel.getFinchStationDetails()
    }

    override fun initializeObservers() {
        super.initializeObservers()
        dashboardViewModel.loading.observe(this, this::isLoading)
        dashboardViewModel.stopList.observe(this, this::updateList)
        dashboardViewModel.stationName.observe(this, this::setStationName)
    }

    private fun isLoading(isLoading: Boolean) {
        if (isLoading) rl_loading_layout.show() else rl_loading_layout.hide()
    }

    private fun setStationName(stationName: String) {
        supportActionBar?.title = stationName
    }

    private fun updateList(it: MutableList<Stop>) {
        stopsAdapter.updateItemList(it.sortByRouteList())
    }
}