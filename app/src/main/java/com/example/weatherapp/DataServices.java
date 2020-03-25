package com.example.weatherapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface DataServices {


//end url /detailsgoschi/users

@GET("detailsgoschi/{table}")
    Call<Check> getCheck(@Path("table") String path);













}
