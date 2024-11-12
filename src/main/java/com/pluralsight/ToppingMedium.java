package com.pluralsight;

public enum ToppingMedium {


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

    //Sauces
    MAYO(ToppingType.SUACES, 0),
    MUSTARD(ToppingType.SUACES, 0),
    KETCHUP(ToppingType.SUACES, 0),
    RANCH(ToppingType.SUACES, 0),
    THOUSAND_ISLANDS(ToppingType.SUACES, 0),
    VINAIGRETTE(ToppingType.SUACES, 0),

    // Small Toppings (Meats)
    HAM(ToppingType.MEDIUM, 2.00),
    STEAK(ToppingType.MEDIUM, 2.00),
    BACON(ToppingType.MEDIUM, 2.00),
    SALAMI(ToppingType.MEDIUM, 2.00),
    ROASTBEEF(ToppingType.MEDIUM, 2.00),
    CHICKEN(ToppingType.MEDIUM, 2.00),

    //Extra meat
    HAM_EXTRA(ToppingType.EXTRAMEAT, 1.00),
    STEAK_EXTRA(ToppingType.EXTRAMEAT, 1.00),
    BACON_EXTRA(ToppingType.EXTRAMEAT, 1.00),
    SALAMI_EXTRA(ToppingType.EXTRAMEAT, 1.00),
    ROASTBEEF_EXTRA(ToppingType.EXTRAMEAT, 1.00),
    CHICKEN_EXTRA(ToppingType.EXTRAMEAT, 1.00),

    //CHEESE
    AMERICAN(ToppingType.MEDIUM, 1.50),
    PROVOLONE(ToppingType.MEDIUM, 1.50),
    CHEDDAR(ToppingType.MEDIUM, 1.50),
    SWISS(ToppingType.MEDIUM, 1.50),

    AMERICAN_EXTRA(ToppingType.EXTRACHEESE, 0.60),
    PROVOLONE_Extra(ToppingType.EXTRACHEESE, 0.60),
    CHEDDAR_EXTRA(ToppingType.EXTRACHEESE, 0.60),
    SWISS_EXTRA(ToppingType.EXTRACHEESE, 0.60);

    private final ToppingType type;
    private final double price;

    ToppingMedium(ToppingType type, double price) {
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
