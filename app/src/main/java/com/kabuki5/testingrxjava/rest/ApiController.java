package com.kabuki5.testingrxjava.rest;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Kabuki on 09/04/2017.
 * Optimus Mobile Engineering
 */

public class ApiController {

    private static ApiController instance;

    private ApiService mService;

    private ApiController() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://sportmates.hol.es")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        mService = retrofit.create(ApiService.class);
    }

    public static ApiController getInstance() {
        if (instance == null)
            instance = new ApiController();
        return instance;
    }

    public ApiService getService() {
        return mService;
    }

}
