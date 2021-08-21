package com.example.spider_3rdtask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Biography {
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("alterEgos")
    @Expose
    private String alterEgos;
    @SerializedName("placeOfBirth")
    @Expose
    private String placeOfBirth;
    @SerializedName("firstAppearance")
    @Expose
    private String firstAppearance;
    @SerializedName("publisher")
    @Expose
    private String publisher;

    @SerializedName("aliases")
    @Expose
    String[] aliases = new String[10];
    @SerializedName("alignment")
            @Expose
            private String alignment;
    Biography(String fullName,String alterEgos,String placeOfBirth,String firstAppearance,String publisher,String[] aliases,String alignment)
    {
        this.fullName = fullName;
        this.alterEgos = alterEgos;
        this.placeOfBirth = placeOfBirth;
        this.firstAppearance = firstAppearance;
        this.publisher = publisher;
        for(int i=0;i<10;i++) {
            this.aliases = aliases;
        }
        this.alignment = alignment;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAlterEgos() {
        return alterEgos;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public String getFirstAppearance() {
        return firstAppearance;
    }

    public String getPublisher() {
        return publisher;
    }

    public String[] getAliases() {
        return aliases;
    }

    public String getAlignment() {
        return alignment;
    }
}
