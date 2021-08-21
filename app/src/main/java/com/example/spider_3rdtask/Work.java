package com.example.spider_3rdtask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Work {
    @SerializedName("occupation")
    @Expose
    private String occupation;
    @SerializedName("base")
    @Expose
    private String base;
Work(String occupation,String base)
{
    this.occupation = occupation;
    this.base = base;
}

    public String getBase() {
        return base;
    }

    public String getOccupation() {
        return occupation;
    }
}
