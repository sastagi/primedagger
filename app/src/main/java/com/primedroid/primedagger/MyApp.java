package com.primedroid.primedagger;

import android.app.Application;

/**
 * Created by sastagi on 5/8/16.
 */
public class MyApp extends Application {
    private FruitComponent mFruitComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mFruitComponent = DaggerFruitComponent.builder().appModule(new AppModule(this))
                .fruitModule(new FruitModule("Apple"))
                .build();

    }

    public FruitComponent getFruitComponent() {
        return mFruitComponent;
    }
}

