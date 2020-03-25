package com.example.weatherapp;


import retrofit2.Retrofit;
import retrofit2.Retrofit.Builder;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitClientInstances {

    private static final String BASE_URL="http://gsbsc.ringersoft.com/";

    private  static Retrofit retrofit;


 static Retrofit getRetrofitInstances()
    {

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();



        return  retrofit;
    }












}
