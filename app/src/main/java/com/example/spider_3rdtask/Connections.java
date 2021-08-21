package com.example.spider_3rdtask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Connections {
    @SerializedName("groupAffiliation")
    @Expose
    private String groupAffiliation;
    @SerializedName("relatives")
    @Expose
    private String relatives;
    Connections(String groupAffiliation,String relatives)
    {
        this.groupAffiliation = groupAffiliation;
        this.relatives = relatives;
    }

    public String getGroupAffiliation() {
        return groupAffiliation;
    }

    public String getRelatives() {
        return relatives;
    }
}
