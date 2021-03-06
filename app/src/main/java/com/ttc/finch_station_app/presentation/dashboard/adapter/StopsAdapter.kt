package com.ttc.finch_station_app.presentation.dashboard.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ttc.finch_station_app.model.local.Stop
import io.reactivex.disposables.CompositeDisposable

class StopsAdapter(
    private val compositeDisposable: CompositeDisposable,
    private var items: List<Stop>,
    private val selectAllListener: RouteAdapter.ItemClickListener
) : RecyclerView.Adapter<StopsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            StopsViewHolder = StopsViewHolder.create(compositeDisposable, parent,items, selectAllListener)


    override fun onBindViewHolder(holder: StopsViewHolder, position: Int) {
        holder.bindData(items[position])
    }

    override fun getItemCount(): Int = items.size

    fun updateItemList(items: List<Stop>) {
        this.items = items
        notifyDataSetChanged()
    }
}