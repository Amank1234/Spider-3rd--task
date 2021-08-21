package com.example.spider_3rdtask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Appearance {
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("race")
    @Expose
    private String race;
    @SerializedName("eyeColor")
    @Expose
    private String eyeColor;
    @SerializedName("hairColor")
    @Expose
    private String hairColor;
    @SerializedName("height")
    @Expose
   String[] height = new String[2];
    @SerializedName("weight")
    @Expose
    String[] weight=new String[2];
    Appearance(String gender, String race, String eyeColor, String hairColor, String[] height,String[] weight)
    {
        this.gender = gender;
        this.race = race;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        for(int i=0;i<2;i++) {


            this.weight = weight;
            this.height = height;
        }
    }

    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String[] getHeight() {
        return height;
    }

    public String[] getWeight() {
        return weight;
    }
}
