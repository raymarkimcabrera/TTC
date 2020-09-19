package com.example.poc.network

import com.example.poc.model.Post
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.http.GET

interface ApiInterface {

    @GET("/posts")
    fun getPost(): Observable<List<Post>>
}