package com.mustafayusef.mytask

import retrofit2.http.GET
import io.reactivex.Observable

interface ApMovie {



    @GET("/filippella/Sample-API-Files/master/json/movies-api.json")
    fun getMovies() : Observable<MovieResponse>
}