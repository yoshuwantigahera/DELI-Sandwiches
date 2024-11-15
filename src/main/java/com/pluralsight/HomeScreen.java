package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HomeScreen {

    static Scanner scanner = new Scanner(System.in);

    public static void HomePage(){
        System.out.println("                             Welcome to Zanzibar DELI-Sandwich");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Would you like to start your Zanzibar experience? \n1) New Order\n0) Exit ");
        int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> OrderScreen();
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
    }

    public static void OrderScreen() {
        Order order = new Order();

        while (true) {
            System.out.println("                             Let's start your Zanzibar Experience");
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
                    HomePage();
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
        System.out.println("Available Meats:\n1) Steak\n2) Ham\n3) Salami\n4) Roasted Beef\n5) Chicken\n6) Bacon ");
        System.out.println("Available Cheese:\n7) American\n8) Provolone\n9) Cheddar\n10) Swiss ");
        System.out.println("Available Free Toppings:\n11) Lettuce\n12) Peppers\n13) Onions\n14) Tomatoes\n15) Jalapenos\n16) Cucumbers \n17) Pickles\n18) Guacamole\n19) Mushrooms ");
        System.out.println("Available Sauces:\n20) Mayo\n21) Mustard\n22) Ketchup\n23) Ranch\n24) Thousand Islands\n25) Vinaigrette ");

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
                    case 4 -> new Topping("Roasted Beef", ToppingType.MEAT, 3.00);
                    case 5 -> new Topping("Chicken", ToppingType.MEAT, 3.00);
                    case 6 -> new Topping("Bacon", ToppingType.MEAT, 3.00);
                    case 7 -> new Topping("American", ToppingType.CHEESE, 2.25);
                    case 8 -> new Topping("Provolone", ToppingType.CHEESE, 2.25);
                    case 9 -> new Topping("Cheddar", ToppingType.CHEESE, 2.25);
                    case 10 -> new Topping("Swiss", ToppingType.CHEESE, 2.25);
                    case 11 -> new Topping("Lettuce", ToppingType.REGULAR, 0.00);
                    case 12 -> new Topping("Peppers", ToppingType.REGULAR, 0.00);
                    case 13 -> new Topping("Onions", ToppingType.REGULAR, 0.00);
                    case 14 -> new Topping("Tomatoes", ToppingType.REGULAR, 0.00);
                    case 15 -> new Topping("Jalapenos", ToppingType.REGULAR, 0.00);
                    case 16 -> new Topping("Cucumbers", ToppingType.REGULAR, 0.00);
                    case 17 -> new Topping("Pickles", ToppingType.REGULAR, 0.00);
                    case 18 -> new Topping("Guacamole", ToppingType.REGULAR, 0.00);
                    case 19 -> new Topping("Mushrooms", ToppingType.REGULAR, 0.00);
                    case 20 -> new Topping("Mayo", ToppingType.SAUCE, 0.00);
                    case 21 -> new Topping("Mustard", ToppingType.SAUCE, 0.00);
                    case 22 -> new Topping("Ketchup", ToppingType.SAUCE, 0.00);
                    case 23 -> new Topping("Ranch", ToppingType.SAUCE, 0.00);
                    case 24 -> new Topping("Thousand Islands", ToppingType.SAUCE, 0.00);
                    case 25 -> new Topping("Vinaigrette", ToppingType.SAUCE, 0.00);

                    default -> throw new IllegalArgumentException();
                };

                sandwich.addTopping(topping);

            } catch (Exception e) {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    //Add drinks
    private static void addDrink(Order order) {
        System.out.println("Choose drink size: 1) Small = ($2.00) 2) Medium = ($2.50) 3) Large = ($3.00)" );
        DrinkSize size = DrinkSize.values()[scanner.nextInt() - 1];

        System.out.println("Choose drink flavor: 1) Coke 2) Sprite 3) Fanta");
        String flavor = scanner.next();

        order.addDrink(new Drink(size, flavor));
    }
    //Add chips
    private static void addChips(Order order) {
        System.out.println("Enter chip type below: ($1.50)" );
        String type = scanner.next();

        System.out.println("How many bags of chips?");
        int quantity = scanner.nextInt();

        order.addChip(new Chip(type, quantity));
    }

    //order receipt
    private static void checkout(Order order) {
        System.out.println("\nOrder Summary:");
        System.out.println(order.checkOut());

        System.out.println("Confirm order? (y/n)");
        if (scanner.next().equalsIgnoreCase("y")) {
            saveReceipt(order);
        } else {
            System.out.println("Order canceled.");
        }
        HomePage();
    }

    private static void saveReceipt(Order order) {
        String filename = "zanzibarOrders.CSV.xlsx" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss")) + ".txt";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(order.checkOut());
            System.out.println("Receipt saved: " + filename);
        } catch (IOException e) {
            System.out.println("Error saving receipt.");
        }
        HomePage();
    }
}
