package com.pluralsight;

public enum ToppingName {



        // Regular Toppings
        LETTUCE(ToppingType.REGULAR, 0),
        TOMATO(ToppingType.REGULAR, 0),
        ONIONS(ToppingType.REGULAR, 0),
        JALAPENOS(ToppingType.REGULAR, 0),
        CUCUMBERS(ToppingType.REGULAR, 0),
        PICKLES(ToppingType.REGULAR, 0),
        GUACAMOLE(ToppingType.REGULAR, 0),
        MUSHROOMS(ToppingType.REGULAR, 0),
        PEPPERS(ToppingType.REGULAR, 0),

        // Small Toppings (Meats)
        HAM_SMALL(ToppingType.SMALL, 1.00),
        STEAK_SMALL(ToppingType.SMALL, 1.00),
        BACON_SMALL(ToppingType.SMALL, 1.00),
        SALAMI_SMALL(ToppingType.SMALL, 1.00),
        ROASTBEEF_SMALL(ToppingType.SMALL, 1.00),
        CHICKEN_SMALL(ToppingType.SMALL, 1.00),

        // Medium Toppings (Meats)
        HAM_MEDIUM(ToppingType.MEDIUM, 2.00),
        STEAK_MEDIUM(ToppingType.MEDIUM, 2.00),
        BACON_MEDIUM(ToppingType.MEDIUM, 2.00),
        SALAMI_MEDIUM(ToppingType.MEDIUM, 2.00),
        ROASTBEEF_MEDIUM(ToppingType.MEDIUM, 2.00),
        CHICKEN_MEDIUM(ToppingType.MEDIUM, 2.00),

        // Medium Toppings (Meats)
        HAM_LARGE(ToppingType.LARGE, 2.00),
        STEAK_LARGE(ToppingType.LARGE, 2.00),
        BACON_LARGE(ToppingType.LARGE, 2.00),
        SALAMI_LARGE(ToppingType.LARGE, 2.00),
        ROASTBEEF_LARGE(ToppingType.LARGE, 2.00),
        CHICKEN_LARGE(ToppingType.LARGE, 2.00);

        private final ToppingType type;
        private final double price;

        ToppingName(ToppingType type, double price) {
            this.type = type;
            this.price = price;
        }

        public ToppingType getType() {
            return type;
        }

        public double getPrice() {
            return price;
        }
}


