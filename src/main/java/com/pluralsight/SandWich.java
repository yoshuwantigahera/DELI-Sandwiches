package com.pluralsight;

import javax.script.ScriptContext;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


public abstract class SandWich extends Order {
    private int size;
    private BreadType bread;
    private  ArrayList<String> toppings;
    private boolean toasted;


    public SandWich(int size, BreadType bread, ArrayList<String> toppings, boolean toasted){
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

    public BreadType getBread() {
        return bread;
    }

    public void setBread(BreadType bread) {
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
    public static void getPrice(){
        System.out.println("Choose your size (inch): " +
                " 1) 4 \n" +
                " 2) 8 \n" +
                " 3) 12 \n");
        Scanner myscanner = new Scanner(System.in);
        int size = myscanner.nextInt();

        SandWichSize BasePrice = switch (size){
            case 1 -> SandWichSize.SMALL;
            case 2 -> SandWichSize.MEDIUM;
            case 3 -> SandWichSize.LARGE;
            default -> SandWichSize.DEFAULT;

        };
        System.out.println("You selected an " + size + "inch Sub");

    }

    public static void selectBread(){
        System.out.println("Choose your bread type:\n " +
                " 1) white \n" +
                " 2) wheat \n" +
                " 3) rye \n" +
                " 4) wrap ");

        Scanner myscanner = new Scanner(System.in);
        int BreadChoice = myscanner.nextInt();

        BreadType bread = switch (BreadChoice){
            case 1 -> BreadType.WHITE;
            case 2 -> BreadType.WHEAT;
            case 3 -> BreadType.RYE;
            case 4 -> BreadType.WRAP;
            default -> throw new IllegalArgumentException("Unexpected value: " + BreadChoice);

        };
    }

    public static void meatChoice(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What Zanzibar meat choice would you like: \n" +
                " 1) steak \n " +
                " 2) ham \n" +
                " 3) salami \n" +
                " 4) roast beef \n" +
                " 5) chicken \n" +
                " 6) bacon ");

        int meatChoice = myScanner.nextInt();



        MeatChoice meat = switch(meatChoice){
            case 1 -> MeatChoice.STEAK;
            case 2 -> MeatChoice.HAM;
            case 3 -> MeatChoice.SALAMI;
            case 4 -> MeatChoice.ROASTBEEF;
            case 5 -> MeatChoice.CHICKEN;
            case 6 -> MeatChoice.BACON;
            default -> throw new IllegalStateException("Unexpected value: " + meatChoice);
        };
    }




    public void  DisplayOrder(){
        System.out.println();
    }


    public static void display(String s) {
        System.out.println();
    }

}
