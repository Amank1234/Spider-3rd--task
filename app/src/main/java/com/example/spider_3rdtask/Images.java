package com.example.spider_3rdtask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images {
    @SerializedName("xs")
    @Expose
    private String xs;
    @SerializedName("sm")
    @Expose
    private String sm;
    @SerializedName("md")
    @Expose
    private String md;
    @SerializedName("lg")
    @Expose
    private String lg;
    Images(String xs,String sm,String md,String lg)
    {
        this.xs = xs;
        this.sm = sm;
        this.md = md;
        this.lg = lg;
    }

    public String getLg() {
        return lg;
    }

    public String getMd() {
        return md;
    }

    public String getSm() {
        return sm;
    }

    public String getXs() {
        return xs;
    }
}
