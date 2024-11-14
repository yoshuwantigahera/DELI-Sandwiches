package com.pluralsight;

import java.util.*;

public class Order {
    private List<SandWich> sandwiches ;
    private List<Drink> drinks;
    private Map<ChipType, Integer> chips;
    final double chipPrice = 1.50;

    public Order() {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new HashMap<>();
    }


    public void addSandwich(SandWich sandWich){
        this.addSandwich(sandWich);
    }

    public void addChips(ChipType type, int count) {
       chips.put(type, chips.getOrDefault(type, 0) + count);
    }

    public void addDrink(Drink drink){
        this.addDrink(drink);
    }

    public double calculateTotal(){
        double total = 0;
        for (ChipType type : chips.keySet()){
            total += chips.get(type) * chipPrice;
        }
        for(SandWich sandWich : sandwiches) total =+sandWich.calculateTotal();
        for (Drink drink : drinks) total += drink.getPrice();
        return total;
    }

    public String checkOut() {
        StringBuilder details = new StringBuilder();
        for (SandWich sandWich : sandwiches)details.append(sandWich).append("\n");
        for (Drink drink : drinks) details.append(drink).append("\n");
        for (Map.Entry<ChipType, Integer> entry : chips.entrySet()){
            details.append(entry.getValue()).append(entry.getValue() * chipPrice).append(")\n");
        }
        details.append("Total Price: $").append(calculateTotal());
        return details.toString();
    }
}

