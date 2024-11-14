package com.pluralsight;

public class Chip {
    private String type;
    private int quantity;

    public Chip(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public double getPrice() {
        return quantity * 1.50;
    }

    @Override
    public String toString() {
        return quantity + " bag(s) of " + type + " chips ($" + getPrice() + ")";
    }

}
