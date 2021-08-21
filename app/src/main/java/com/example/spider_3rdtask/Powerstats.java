package com.example.spider_3rdtask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Powerstats {
    @SerializedName("intelligence")
    @Expose
    private int intelligence;
    @SerializedName("strength")
    @Expose
    private int strength;
    @SerializedName("speed")
    @Expose
    private int speed;
    @SerializedName("durability")
    @Expose
    private int durability;
    @SerializedName("power")
    @Expose
    private int power;
    @SerializedName("combat")
    @Expose
    private int combat;
    Powerstats(int intelligence,int strength,int speed,int durability,int power,int combat)
    {
        this.intelligence = intelligence;
        this.speed = speed;
        this.strength = strength;
        this.durability = durability;
        this.power = power;
        this.combat = combat;
    }

    public int getCombat() {
        return combat;
    }

    public int getDurability() {
        return durability;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getPower() {
        return power;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }

}
