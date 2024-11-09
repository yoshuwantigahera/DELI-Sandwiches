package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class SandWich extends Order {
    private  int size;
    private String bread;
    private  ArrayList<String> toppings;
    private boolean toasted;

    public SandWich(int size, String bread, ArrayList<String> toppings){
        this.size = size;
        this.bread = bread;
        this.toppings = new ArrayList<>(); // Initialize toppings with passed list
        this.toasted = toasted;

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    // Method to add a topping to the list
    public void addToppings(String topping){
        this.addToppings(topping); //Adds new topping to list
    }

    // Calculate the price of the sandwich based on size and toppings
    public  double getPrice(){
        double Baseprice = switch (size){
            case 4 -> 5.50;
            case 8 -> 6.50;
            case 12 -> 7.50;
            default -> 0;
        };
        return getPrice();
    }

    public static void selectBread(){
        System.out.println("Choose your bread type: White, Wheat, Rye, or Wrap.");

        Scanner myscanner = new Scanner(System.in);
        String choice = myscanner.nextLine();

        switch (choice.toLowerCase()){
            case "white":
            case "wheat":
            case "rye":
            case "wrap":
                System.out.println("You selected: " + choice);
                break;
            default:
                System.out.println("Invalid choice. Please try again");
                selectBread();
                break;
        }
    }


    public static void display(String s) {
    }
}
