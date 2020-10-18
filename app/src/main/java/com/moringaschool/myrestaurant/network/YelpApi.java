package com.moringaschool.myrestaurant.network;

import com.moringaschool.myrestaurant.models.YelpBusinessesSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YelpApi {

    @GET("businesses/search")
    Call<YelpBusinessesSearchResponse> getRestaurants(
            @Query("location") String location,
            @Query("term") String term
    );
}
