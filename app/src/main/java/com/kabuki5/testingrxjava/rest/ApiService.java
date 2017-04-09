package com.kabuki5.testingrxjava.rest;

import com.kabuki5.testingrxjava.models.ModelExample;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Kabuki on 09/04/2017.
 * Optimus Mobile Engineering
 */

public interface ApiService {

    @GET("/api/activities")
    Observable<List<ModelExample>> getApiData();

}
