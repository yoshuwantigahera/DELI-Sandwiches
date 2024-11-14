package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private SandwichSize size;
    private BreadType breadType;
    private boolean toasted;
    private List<Topping> toppings;

    public Sandwich(SandwichSize size, BreadType breadType, boolean toasted) {
        this.size = size;
        this.breadType = breadType;
        this.toasted = toasted;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double calculatePrice() {
        double totalPrice = size.getBasePrice();
        for (Topping topping : toppings) {
            totalPrice += topping.getPrice(size);
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(size).append(" Sandwich on ").append(breadType).append(toasted ? " (Toasted)" : "")
                .append("\nToppings:");
        for (Topping topping : toppings) {
            sb.append("\n- ").append(topping);
        }
        sb.append("\nTotal: $").append(calculatePrice());
        return sb.toString();
    }
}
