package com.t3h.appdc.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiBuilder {
    private static Retrofit retrofit;

    public static Retrofit getInstan(){
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl("http://192.168.1.77:88/demo_pets/").build();
        }
        return retrofit;

    }
}
