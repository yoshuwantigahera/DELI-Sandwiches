package com.pluralsight;

public class Topping {
    private String name;
    private ToppingType type;
    private int quantity;  // For extras
    private double basePrice;  // Applied only for premium toppings

    public Topping(String name, ToppingType type, double basePrice) {
        this.name = name;
        this.type = type;
        this.basePrice = basePrice;
        this.quantity = 1;
    }

    public void addExtra() {
        this.quantity++;
    }

    public double getPrice(SandwichSize size) {
        double pricePerUnit = switch (type) {
            case MEAT -> size.getMeatPrice();
            case CHEESE -> size.getCheesePrice();
            default -> 0.00;
        };

        double extraPricePerUnit = switch (type) {
            case MEAT -> size.getExtraMeatPrice();
            case CHEESE -> size.getExtraCheesePrice();
            default -> 0.00;
        };

        return (pricePerUnit + (quantity - 1) * extraPricePerUnit);
    }

    @Override
    public String toString() {
        return name + " x" + quantity + " ($" + basePrice + ")";
    }
}
