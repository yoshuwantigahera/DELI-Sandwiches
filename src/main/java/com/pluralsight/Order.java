package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
    private List<SandWich> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private Map<ChipType, integer> chips = new HashMap<>()
    final double chipPrice = 1.50;
//    private List<Chips> chips = new ArrayList<>();

    public Order(){
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
    }

    public void addSandwich(SandWich sandWich){
        this.addSandwich(sandWich);
    }
    public void addChips(ChipType chips, int count) {
       chips.put(type, chips.getOrDefualt(type, 0)) + count);
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


//    public void checkout(){
//        System.out.println("Order summary: ");
//        sandwiches.forEach(SandWich::display);
//        drinks.forEach(Drink::toString);
//        chips.forEach(Chips::display);
//        System.out.println("Total: $%.2f\n" );
//        Receipt.saveOrder(this);
//    }

}
