package com.pluralsight;

import java.util.ArrayList;

public class SandWich {
    private int size;
    private String bread;
    private ArrayList<String> toppings;

    public SandWich(int size, String bread, ArrayList<String> toppings){
        this.size = size;
        this.bread = bread;
        this.toppings = new ArrayList<>();

    }
}
