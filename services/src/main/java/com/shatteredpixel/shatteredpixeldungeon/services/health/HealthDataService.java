package com.shatteredpixel.shatteredpixeldungeon.services.health;


import java.util.ArrayList;

public abstract class HealthDataService {

    public static abstract class HealthResultCallback {
        public abstract void onDataFetched(ArrayList<HealthData> data);
        public abstract void onConnectionFailed();
    }

    public abstract void fetchHealthData(boolean useMetered, HealthResultCallback callback);
}
