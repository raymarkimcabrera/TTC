package com.ttc.finch_station_app.presentation.routes

import android.view.MenuItem
import com.ttc.finch_station_app.R
import com.ttc.finch_station_app.base.BaseActivity
import com.ttc.finch_station_app.model.local.Stop
import com.ttc.finch_station_app.presentation.routes.adapter.FullRouteAdapter
import kotlinx.android.synthetic.main.activity_routes.*

class RoutesActivity : BaseActivity() {

    private var stop: Stop? = null
    companion object{
        const val TAG_ROUTE = "TAG_ROUTE"
    }
    override fun getLayoutId(): Int = R.layout.activity_routes

    override fun initializeViews() {
        initializeValues()
        initializeRecyclerView()
        supportActionBar?.title = stop?.name
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
    private fun initializeRecyclerView() {
        stop?.routes?.let {
            val adapter = FullRouteAdapter(subscriptionsWhileInMemory, it)
            rv_route_full_list.adapter = adapter
        }

    }

    private fun initializeValues() {
        intent.run {
            stop = getParcelableExtra(TAG_ROUTE)
        }
    }
}