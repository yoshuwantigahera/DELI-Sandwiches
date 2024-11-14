package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HomeScreen {
    static Scanner scanner = new Scanner(System.in);

    public void HomePage() {
        Order order = new Order();

        while (true) {
            System.out.println("                             Welcome to Zanzibar DELI-Sandwich");//welcome
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1) New Sandwich\n2) Add Drink\n3) Add Chips\n4) Checkout\n0) Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Clear the newline

            switch (choice) {
                case 1 -> addSandwich(order);
                case 2 -> addDrink(order);
                case 3 -> addChips(order);
                case 4 -> checkout(order);
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }
    private static void addSandwich(Order order) {
        SandwichSize size = forSandwichSize();
        BreadType breadType = forBreadType();
        boolean toasted = forToasting();

        Sandwich sandwich = new Sandwich(size, breadType, toasted);
        addToppings(sandwich);
        order.addSandwich(sandwich);
    }

    private static SandwichSize forSandwichSize() {
        System.out.println("Choose sandwich size: 1) 4\" ($5.50) 2) 8\" ($7.00) 3) 12\" ($8.50)");
        int choice = scanner.nextInt();
        return switch (choice) {
            case 1 -> SandwichSize.SMALL;
            case 2 -> SandwichSize.MEDIUM;
            case 3 -> SandwichSize.LARGE;
            default -> {
                System.out.println("Invalid choice. Defaulting to 8\".");
                yield SandwichSize.MEDIUM;
            }
        };
    }

    private static BreadType forBreadType() {
        System.out.println("Choose bread type: 1) White 2) Wheat 3) Rye 4) Wrap");
        int choice = scanner.nextInt();
        return BreadType.values()[choice - 1];
    }

    private static boolean forToasting() {
        System.out.println("Would you like it toasted? (y/n)");
        String choice = scanner.next();
        return choice.equalsIgnoreCase("y");
    }

    private static void addToppings(Sandwich sandwich) {
        System.out.println("Available toppings:\n1) Steak\n2) Ham\n3) Salami\n4) Bacon\n5) American\n6) Swiss\n7) Lettuce\n8) Ketchup");
        System.out.println("Type 'done' when finished.");

        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("done")) break;

            try {
                int toppingChoice = Integer.parseInt(input);

                Topping topping = switch (toppingChoice) {
                    case 1 -> new Topping("Steak", ToppingType.MEAT, 3.00);
                    case 2 -> new Topping("Ham", ToppingType.MEAT, 3.00);
                    case 3 -> new Topping("Salami", ToppingType.MEAT, 3.00);
                    case 4 -> new Topping("Bacon", ToppingType.MEAT, 3.00);
                    case 5 -> new Topping("American", ToppingType.CHEESE, 2.25);
                    case 6 -> new Topping("Swiss", ToppingType.CHEESE, 2.25);
                    case 7 -> new Topping("Lettuce", ToppingType.REGULAR, 0.00);
                    case 8 -> new Topping("Ketchup", ToppingType.SAUCE, 0.00);
                    default -> throw new IllegalArgumentException();
                };

                sandwich.addTopping(topping);

            } catch (Exception e) {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    /////Add drinks
    private static void addDrink(Order order) {
        System.out.println("Choose drink size: 1) Small 2) Medium 3) Large");
        DrinkSize size = DrinkSize.values()[scanner.nextInt() - 1];

        System.out.println("Choose drink flavor: 1) Coke 2) Sprite 3) Fanta");
        String flavor = scanner.next();

        order.addDrink(new Drink(size, flavor));
    }

    private static void addChips(Order order) {
        System.out.println("Enter chip type:");
        String type = scanner.next();

        System.out.println("How many bags of chips?");
        int quantity = scanner.nextInt();

        order.addChip(new Chip(type, quantity));
    }

    //order reciept
    private static void checkout(Order order) {
        System.out.println("\nOrder Summary:");
        System.out.println(order.checkOut());

        System.out.println("Confirm order? (y/n)");
        if (scanner.next().equalsIgnoreCase("y")) {
            saveReceipt(order);
        } else {
            System.out.println("Order canceled.");
        }
    }

    private static void saveReceipt(Order order) {
        String filename = "ZanzibarOrders.csv.xlsx" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss")) + ".txt";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(order.checkOut());
            System.out.println("Receipt saved: " + filename);
        } catch (IOException e) {
            System.out.println("Error saving receipt.");
        }
    }
}
