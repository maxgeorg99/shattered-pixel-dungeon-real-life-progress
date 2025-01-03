package com.shatteredpixel.shatteredpixeldungeon.services.health;

import java.util.Date;

public class HealthData {
    public String type; // "steps", "running", "weight_training", etc.
    public int value; // e.g., step count, distance in meters, weight lifted
    public Date timestamp;

    public HealthData(String type, int value, Date timestamp) {
        this.type = type;
        this.value = value;
        this.timestamp = timestamp;
    }
}
