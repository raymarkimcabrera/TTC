package com.ttc.finch_station_app.network

import com.ttc.finch_station_app.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiInterface {

    @GET("/posts")
    fun getPost(): Observable<List<Post>>
}