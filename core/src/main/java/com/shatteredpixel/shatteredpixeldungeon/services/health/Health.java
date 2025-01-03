package com.shatteredpixel.shatteredpixeldungeon.services.health;

import com.shatteredpixel.shatteredpixeldungeon.SPDSettings;

import java.util.ArrayList;
import java.util.Date;

public class Health {

    public static HealthDataService service;

    public static boolean supportsHealth() {
        return service != null;
    }

    private static Date lastFetch = null;
    private static final long FETCH_DELAY = 1000 * 60 * 60; //1 hour
    private static ArrayList<HealthData> healthData;

    public static void fetchHealthData() {
        if (!supportsHealth()) return;
        if (lastFetch != null && (new Date().getTime() - lastFetch.getTime()) < FETCH_DELAY) return;

        service.fetchHealthData(!SPDSettings.WiFi(), new HealthDataService.HealthResultCallback() {
            @Override
            public void onDataFetched(ArrayList<HealthData> data) {
                lastFetch = new Date();
                healthData = data;
            }

            @Override
            public void onConnectionFailed() {
                lastFetch = null;
                healthData = null;
            }
        });
    }

    public static synchronized boolean dataAvailable() {
        return healthData != null && !healthData.isEmpty();
    }

    public static synchronized ArrayList<HealthData> getHealthData() {
        return new ArrayList<>(healthData);
    }

    public static synchronized void clearData() {
        healthData = null;
        lastFetch = null;
    }
}