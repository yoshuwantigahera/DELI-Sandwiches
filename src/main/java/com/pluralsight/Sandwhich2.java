package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Sandwhich2 {

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            Order order = new Order();

            while (true) {
                System.out.println("1) New Sandwich\n2) Add Drink\n3) Add Chips\n4) Checkout\n0) Exit");
                int choice = scanner.nextInt();
                scanner.nextLine();  // Clear the newline

                switch (choice) {
                    case 1 -> addSandwich(order);
                    case 2 -> addDrink(order);
                    case 3 -> addChips(order);
                    case 4 -> {
                        System.out.println("\nOrder Summary:");
                        System.out.println(order.checkOut());
                        saveReceipt(order);
                        return;
                    }
                    case 0 -> { System.out.println("Exiting..."); return; }
                    default -> System.out.println("Invalid option. Try again.");
                }
            }
        }

        private static void addSandwich(Order order) {
            SandWichSize size = promptForSandwichSize();
            BreadType breadType = promptForBreadType();
            boolean toasted = promptForToasting();

            SandWich sandWich = new SandWich(size, breadType, toasted);
            addToppings(sandWich);
            order.addSandwich(sandWich);
        }

        private static SandWichSize promptForSandwichSize() {
            System.out.println("Choose sandwich size: 1) 4\" ($5.50) 2) 8\" ($7.00) 3) 12\" ($8.50)");
            int choice = scanner.nextInt();
            return switch (choice) {
                case 1 -> SandWichSize.SMALL;
                case 2 -> SandWichSize.MEDIUM;
                case 3 -> SandWichSize.LARGE;
                default -> SandWichSize.DEFAULT;
            };
        }

        private static BreadType promptForBreadType() {
            System.out.println("Choose bread type: 1) White 2) Wheat 3) Rye 4) Wrap");
            int choice = scanner.nextInt();
            return BreadType.values()[choice - 1];
        }

        private static boolean promptForToasting() {
            System.out.println("Would you like it toasted? (y/n)");
            String choice = scanner.next();
            return choice.equalsIgnoreCase("y");
        }

        private static void addToppings(SandWich sandwich) {
            System.out.println("Available toppings:\n1) Lettuce\n2) Tomato\n3) Bacon\n4) Cheese");
            System.out.println("Type 'done' when finished.");

            while (true) {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) break;
                int toppingChoice = Integer.parseInt(input);

                Toppings topping = switch (toppingChoice) {
                    case 1 -> new Toppings("Lettuce", ToppingType.REGULAR, 0.00);
                    case 2 -> new Toppings("Tomato", ToppingType.REGULAR, 0.0);
                    case 3 -> new Toppings("Bacon", ToppingType.REGULAR, 1.00);
                    case 4 -> new Toppings("Cheese", ToppingType.SMALL, 0.75);
                    default -> null;
                };

                if (topping != null) sandwich.addToppings(topping);
            }
        }

        private static void addDrink(Order order) {
            System.out.println("Choose drink size: 1) Small ($2.00) 2) Medium ($2.50) 3) Large ($3.00)");
            int sizeChoice = scanner.nextInt();
            DrinkSize size = DrinkSize.values()[sizeChoice - 1];

            System.out.println("Choose drink flavor: 1) Coke 2) Pepsi 3) Sprite 4) Fanta");
            int flavorChoice = scanner.nextInt();
            DrinkFlavors flavor = DrinkFlavors.values()[flavorChoice - 1];

            order.addDrink(new Drink(size, flavor));
        }

        private static void addChips(Order order) {
            System.out.println("Choose chip type: 1) BBQ 2) Salted 3) Sour Cream");
            int chipChoice = scanner.nextInt();
            ChipType type = ChipType.values()[chipChoice - 1];

            System.out.println("How many bags of " + type + " chips? ($1.50 each)");
            int count = scanner.nextInt();

            order.addChips(type, count);
        }

        private static void saveReceipt(Order order) {
            String filename = "receipts/" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss")) + ".txt";
            try (FileWriter writer = new FileWriter(filename)) {
                writer.write(order.checkOut());
                System.out.println("Order saved to " + filename);
            } catch (IOException e) {
                System.out.println("Error saving receipt.");
            }
        }
    }

