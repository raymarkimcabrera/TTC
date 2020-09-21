package com.ttc.finch_station_app.presentation.dashboard

import android.content.Intent
import androidx.activity.viewModels
import com.ttc.finch_station_app.R
import com.ttc.finch_station_app.base.BaseActivity
import com.ttc.finch_station_app.extensions.hide
import com.ttc.finch_station_app.extensions.show
import com.ttc.finch_station_app.model.local.Stop
import com.ttc.finch_station_app.presentation.dashboard.adapter.RouteAdapter
import com.ttc.finch_station_app.presentation.dashboard.adapter.StopsAdapter
import com.ttc.finch_station_app.presentation.routes.RoutesActivity
import com.ttc.finch_station_app.presentation.routes.RoutesActivity.Companion.TAG_ROUTE
import com.ttc.finch_station_app.viewmodel.DashboardViewModel
import kotlinx.android.synthetic.main.activity_dashboard.*

fun MutableList<Stop>.sortByRouteList(): MutableList<Stop> {
    val temp = this
    temp.sortByDescending {
        it.routes?.size
    }
    return temp
}

class DashboardActivity : BaseActivity(), RouteAdapter.SeeAllListener {

    private val stopsAdapter = StopsAdapter(subscriptionsWhileInMemory, mutableListOf(), this)

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

    override fun onSeeAll(stop: Stop) {
        val intent = Intent(this@DashboardActivity, RoutesActivity::class.java)
        intent.putExtra(TAG_ROUTE, stop)
        startActivity(intent)
    }
}