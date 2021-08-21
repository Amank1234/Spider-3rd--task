package com.example.spider_3rdtask;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static Retrofit retrofit;
    private static ApiClient instance = null;
    private static Api myApi;
    private static String BASE_URL = "https://akabab.github.io/superhero-api/api/";

    public static Retrofit getClient()
    {
if(retrofit == null)
{
    retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
}
return retrofit;
    }

    public static synchronized ApiClient getInstance()
    {
        if(instance == null)
        {
            instance = new ApiClient();
        }
        return instance;
    }

    public Api getApi()
    {
        return retrofit.create(Api.class);
    }
}
