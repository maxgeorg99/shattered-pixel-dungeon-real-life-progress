package com.shatteredpixel.shatteredpixeldungeon.services.news;

import com.shatteredpixel.shatteredpixeldungeon.services.health.HealthData;
import com.shatteredpixel.shatteredpixeldungeon.services.health.HealthDataService;

import java.util.ArrayList;
import java.util.Date;

public class DebugHealthData extends HealthDataService {

    @Override
    public void fetchHealthData(boolean useMetered, HealthResultCallback callback) {
        // Mock data for testing
        ArrayList<HealthData> mockData = new ArrayList<>();
        mockData.add(new HealthData("steps", 10000, new Date()));
        mockData.add(new HealthData("running", 5000, new Date()));
        mockData.add(new HealthData("weight_training", 60, new Date()));

        // Simulate success
        callback.onDataFetched(mockData);
    }
}
