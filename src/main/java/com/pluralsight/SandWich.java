package com.pluralsight;

import javax.script.ScriptContext;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


public class SandWich extends Order {
    private SandWichSize size;
    private BreadType bread;
    private boolean toasted;
    private ArrayList<Toppings> toppings;


    public SandWich(SandWichSize size, BreadType bread, boolean toasted) {
        this.size = size;
        this.bread = bread;
        this.toasted = toasted;
        this.toppings = new ArrayList<>(); // Initialize toppings with passed list

    }


    // Method to add a topping to the list
    public void addToppings(Toppings topping) {
        this.addToppings(topping);
    }

    public double CalculatePrice() {
        double price = size;
        for (Toppings toppings : this.toppings) {
            price += toppings.getToppingsPrice();
        }
        return price;
    }

        @Override
        public String toString () {
            StringBuilder sb = new StringBuilder();
            sb.append(size).append(" Sandwhich ").append(bread).append(" bread ").append(toasted ? "(toasted" : "").append("\n toppings:");
            for (Toppings topping : this.toppings) {
                sb.append("\n-").append(topping.getName()).append("(").append(topping.getType()).append(")");
            }
            sb.append("\nPrice: $").append(CalculatePrice());
            return sb.toString();
        }
}



//    // Calculate the price of the sandwich based on size and toppings
//    public static void getPrice(){
//        System.out.println("Choose your size (inch): " +
//                " 1) 4 \n" +
//                " 2) 8 \n" +
//                " 3) 12 \n");
//        Scanner myscanner = new Scanner(System.in);
//        int size = myscanner.nextInt();
//
//        SandWichSize BasePrice = switch (size){
//            case 1 -> SandWichSize.SMALL;
//            case 2 -> SandWichSize.MEDIUM;
//            case 3 -> SandWichSize.LARGE;
//            default -> SandWichSize.DEFAULT;
//
//        };
//        System.out.println("You selected an " + size + "inch Sub");
//
//    }
//
//    public static void selectBread(){
//        System.out.println("Choose your bread type:\n " +
//                " 1) white \n" +
//                " 2) wheat \n" +
//                " 3) rye \n" +
//                " 4) wrap ");
//
//        Scanner myscanner = new Scanner(System.in);
//        int BreadChoice = myscanner.nextInt();
//
//        BreadType bread = switch (BreadChoice){
//            case 1 -> BreadType.WHITE;
//            case 2 -> BreadType.WHEAT;
//            case 3 -> BreadType.RYE;
//            case 4 -> BreadType.WRAP;
//            default -> throw new IllegalArgumentException("Unexpected value: " + BreadChoice);
//
//        };
//    }
//
//    public static void meatChoice(){
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("What Zanzibar meat choice would you like: \n" +
//                " 1) steak \n " +
//                " 2) ham \n" +
//                " 3) salami \n" +
//                " 4) roast beef \n" +
//                " 5) chicken \n" +
//                " 6) bacon ");
//
//        int meatChoice = myScanner.nextInt();
//
//
//
//        MeatChoice meat = switch(meatChoice){
//            case 1 -> MeatChoice.STEAK;
//            case 2 -> MeatChoice.HAM;
//            case 3 -> MeatChoice.SALAMI;
//            case 4 -> MeatChoice.ROASTBEEF;
//            case 5 -> MeatChoice.CHICKEN;
//            case 6 -> MeatChoice.BACON;
//            default -> throw new IllegalStateException("Unexpected value: " + meatChoice);
//        };
//    }
//
//
//    public double CalculatePrice(){
//        double price = size.get
//    }
//
//
//
//
//
//
//    public static void display(String s) {
//        System.out.println();
//    }
//
//
//    public static void selectChip(){
//        System.out.println("Choose your bread type: Doritos, Cheetos, Lays.");
//
//        Scanner myscanner = new Scanner(System.in);
//        String choice = myscanner.nextLine();
//
//        switch (choice.toLowerCase()){
//            case "doritos":
//            case "cheetos":
//            case "lays":
//                System.out.println("You selected: " + choice);
//                break;
//            default:
//                System.out.println("Invalid choice. Please try again");
//                selectChip();
//                break;
//        }
//    }


