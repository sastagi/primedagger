package com.primedroid.primedagger;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sastagi on 5/8/16.
 */
@Module
public class FruitModule {
    String fruitName;

    public FruitModule(String fruitName){
        this.fruitName = fruitName;
    }

    @Provides
    @Singleton
        // Application reference must come from AppModule.class
    Fruit providesFruit(Application application) {
        return Fruit.getFruit();
    }
}
