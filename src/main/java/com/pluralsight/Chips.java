package com.pluralsight;

import java.util.Scanner;

public class Chips {
    String type;
    String flavor;
    Double price;

    public void display() {
    }


    public static void selectChip(){
        System.out.println("Choose your bread type: Doritos, Cheetos, Lays.");

        Scanner myscanner = new Scanner(System.in);
        String choice = myscanner.nextLine();

        switch (choice.toLowerCase()){
            case "doritos":
            case "cheetos":
            case "lays":
                System.out.println("You selected: " + choice);
                break;
            default:
                System.out.println("Invalid choice. Please try again");
                selectChip();
                break;
        }
    }

}
