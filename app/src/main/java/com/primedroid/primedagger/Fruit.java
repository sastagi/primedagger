package com.primedroid.primedagger;

/**
 * Created by sastagi on 5/8/16.
 */
public class Fruit {
    private String name;
    private String color;
    private int weight;
    private static Fruit fruit;

    private Fruit(String name, String color, int weight){
        this.name = name;
        this.color = color;
        this.weight = weight;

    }

    @Override
    public String toString() {
        return fruit.name+" "+fruit.color+" "+fruit.weight;
    }

    public static Fruit getFruit(){
        if (fruit!=null) {
            return fruit;
        } else {
            fruit = new Fruit("Apple", "red", 10);
            return fruit;
        }
    }

}
