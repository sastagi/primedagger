package com.primedroid.primedagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by sastagi on 5/8/16.
 */
@Singleton
@Component(modules={AppModule.class, FruitModule.class})
public interface FruitComponent {
    void inject(MainActivity activity);
}
