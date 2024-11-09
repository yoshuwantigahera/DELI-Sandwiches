package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Chips> chips = new ArrayList<>();

    public Order(){
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
    }

    public void addSandwich(SandWich sandWich){
        this.addSandwich(sandWich);
    }
    public void addChips(Chips chips){
        this.addChips(chips);
    }

    public void addDrink(Drink drink){
        this.addDrink(drink);
    }

    public void checkout(){
        System.out.println("Order summary: ");
        sandwiches.forEach(SandWich::display);
        drinks.forEach(Drink::display);
        chips.forEach(Chips::display);
        System.out.println("Total: $%.2f\n" );
        Receipt.saveOrder(this);

    }
    public void cancelOrder(){

    }


}
