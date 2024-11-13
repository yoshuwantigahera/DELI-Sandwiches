package com.pluralsight;

import java.util.ArrayList;

public class Toppings {
    private String name;
    private ToppingType Type;
    private double price;


    public Toppings (String name,ToppingType type,  Double price){
        this.name = name;
        this.price = price;
        this.Type = type;

    }

    public String getName() {
        return name;
    }
    public ToppingType getType() {
        return Type;
    }
    public double getPrice() {
        return price;
    }

    public double getToppingsPrice(){
        double toppingBasePrice = switch ((int) price){
            case 4 -> 1.00;
            case 8 -> 2.00;
            case 12 -> 3.00;
            default -> 0;
        };
        return getToppingsPrice();
    }


}
