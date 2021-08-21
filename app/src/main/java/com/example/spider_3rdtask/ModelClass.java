package com.example.spider_3rdtask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelClass
{
    @SerializedName("id")
    @Expose
    private final int id;
    @SerializedName("name")
    @Expose
    private final String name;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("powerstats")
    @Expose
    public Powerstats powerstats;
    @SerializedName("appearance")
    @Expose
    public Appearance appearance;
    @SerializedName("biography")
    @Expose
    public Biography biography;
    @SerializedName("work")
    @Expose
    public Work work;
    @SerializedName("connections")
    @Expose
    public Connections connections;
    @SerializedName("images")
    @Expose
    public Images images;
    ModelClass(int id,String name,String slug,Powerstats powerstats,Appearance appearance,Biography biography,Work work,Connections connections,Images images)
    {
        this.id = id;
        this.name = name;
        this.slug =slug;
        this.powerstats = powerstats;
        this.appearance = appearance;
        this.biography = biography;
        this.work = work;
        this.connections = connections;
        this.images = images;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    public Powerstats getPowerstats() {
        return powerstats;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public Biography getBiography() {
        return biography;
    }

    public Connections getConnections() {
        return connections;
    }

    public Images getImages() {
        return images;
    }

    public Work getWork() {
        return work;
    }
}
