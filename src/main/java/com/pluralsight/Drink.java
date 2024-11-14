package com.pluralsight;


public class Drink {
  private final DrinkSize size;
  private final DrinkFlavors flavor;

    public Drink(DrinkSize size, DrinkFlavors flavor){
        this.size = size;
        this.flavor = flavor;
    }

    public double getPrice(){
        return size.getPrice();
    }

    public String toString(){
        return size + " " + flavor + " drink ($" + getPrice();
    }


}
