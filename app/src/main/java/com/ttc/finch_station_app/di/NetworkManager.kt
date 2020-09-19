package com.ttc.finch_station_app.di

import com.ttc.finch_station_app.model.Post
import com.ttc.finch_station_app.network.ApiInterface
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkManager
@Inject constructor(private val apiInterface: ApiInterface): NetworkRepository{

    override fun getPosts(): Observable<List<Post>> {
       return apiInterface.getPost()
    }
}