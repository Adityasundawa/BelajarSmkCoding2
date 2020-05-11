package com.adityasundawa.smkcoding2.data

import com.adityasundawa.smkcoding2.GithubUserItem
import retrofit2.Call
import retrofit2.http.GET
interface GithubService {
    @GET("users")
    fun getUsers(): Call<List<GithubUserItem>>
}