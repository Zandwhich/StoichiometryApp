package com.example.alex.util;

/**
 * Created by alex on 6/25/17.
 */

public abstract class BasicUnit {

    public final String NAME;

    public final String SYMBOL;

    public final double MASS;

    public BasicUnit(String name, String symbol, double mass) {
        this.NAME = name;
        this.SYMBOL = symbol;
        this.MASS = mass;
    }//end BasicUnit()

}//end BasicUnit
