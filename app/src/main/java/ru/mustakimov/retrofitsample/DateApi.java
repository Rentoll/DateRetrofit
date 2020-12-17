package ru.mustakimov.retrofitsample;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DateApi {
    @GET("/")
    Call<InfoModel> getInfo(@Query("service") String type);
}