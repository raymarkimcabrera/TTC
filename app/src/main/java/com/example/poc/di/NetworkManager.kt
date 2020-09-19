package com.example.poc.di

import com.example.poc.model.Post
import com.example.poc.network.ApiInterface
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