package com.pluralsight;

import java.util.*;

public class Order {

    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chip> chips;

    public Order() {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addChip(Chip chip) {
        chips.add(chip);
    }

    public double calculateTotal() {
        double total = 0;
        for (Sandwich sandwich : sandwiches) total += sandwich.calculatePrice();
        for (Drink drink : drinks) total += drink.getPrice();
        for (Chip chip : chips) total += chip.getPrice();
        return total;
    }

    public String checkOut() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Details:\n");
        for (Sandwich sandwich : sandwiches) sb.append(sandwich).append("\n");
        sb.append("Drinks: ").append(drinks).append("\nChips: ").append(chips).append("\n");
        sb.append("Total: $").append(calculateTotal());
        return sb.toString();
    }
}

