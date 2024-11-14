package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class HoneScreen {
    static Scanner myscanner = new Scanner(System.in);

    static boolean running = true;

//    public HoneScreen(int size, BreadType bread, ArrayList<String> toppings, boolean toasted) {
//        super(size, bread, toppings, toasted);
//    }


    public static void homeScreen() {

        while (running) {
            System.out.println("                             Welcome to Zanzibar DELI-Sandwich");//welcome
            System.out.println("-----------------------------------------------------------------------------------");

            System.out.println("1. New Order" + "\n" + "0. Exit");//1 initiate new order
            int homeAnswer = myscanner.nextInt();
            myscanner.nextLine();


            switch (homeAnswer) {
                case 1:
                    System.out.println("You choice start 'New order', starting new order process...");
                    System.out.println("-----------------------------------------------------------------------------------");
                    OrderScreen();
                    break;

                case 0:
                    System.out.println("Exiting screen. GoodBye");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1 or 0");



            }
        }
    }

    public static void OrderScreen(){
        System.out.println("How will you like to start your Zanzibar experience: ");
        System.out.println("1. Add Sandwich");
        System.out.println("2. Add drink");
        System.out.println("3. Add chips ");
        System.out.println("4. Check");
        System.out.println("0. Cancel Order");
        int startOrder = myscanner.nextInt();
        myscanner.nextLine();
        System.out.println("-----------------------------------------------------------------------------------");

        switch (startOrder){
            case 1:

            case 2:

            case 3:

            case 4:

            case 0:

            default:
        }
    }



}
