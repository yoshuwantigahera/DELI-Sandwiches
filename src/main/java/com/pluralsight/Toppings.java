package com.pluralsight;

import java.util.ArrayList;

public class Toppings extends SandWich {
    private String type;
    private double price;
    private double extraCost;

    public Toppings(int size, String bread, ArrayList<String> toppings, String type, Double price, Double extraCost) {
        super(size, bread, toppings);
        this.type = type;
        this.price = price;
        this.extraCost = extraCost;
    }
}
