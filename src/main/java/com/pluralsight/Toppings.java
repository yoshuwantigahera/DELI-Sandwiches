package com.pluralsight;

import java.util.ArrayList;

public class Toppings extends SandWich {
    private String type;
    private double price;
    private double extraCost;


    public Toppings(int size, BreadType  bread, ArrayList<String> toppings, boolean toasted, String type, double price, double extraCost ) {
        super(size, bread, toppings, toasted);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
//
//    @Override
//    public double getPrice() {
//        return price;
//    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getExtraCost() {
        return extraCost;
    }

    public void setExtraCost(double extraCost) {
        this.extraCost = extraCost;
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
