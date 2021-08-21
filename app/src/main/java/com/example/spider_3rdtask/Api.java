package com.example.spider_3rdtask;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
@GET("all.json")
    Call<List<ModelClass>> getData();
}
