package com.pluralsight;

public enum ToppingLarge {

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
    HAM(ToppingType.MEDIUM, 3.00),
    STEAK(ToppingType.MEDIUM, 3.00),
    BACON(ToppingType.MEDIUM, 3.00),
    SALAMI(ToppingType.MEDIUM, 3.00),
    ROASTBEEF(ToppingType.MEDIUM, 3.00),
    CHICKEN(ToppingType.MEDIUM, 3.00),

    //Extra meat
    HAM_EXTRA(ToppingType.EXTRAMEAT, 1.50),
    STEAK_EXTRA(ToppingType.EXTRAMEAT, 1.50),
    BACON_EXTRA(ToppingType.EXTRAMEAT, 1.50),
    SALAMI_EXTRA(ToppingType.EXTRAMEAT, 1.50),
    ROASTBEEF_EXTRA(ToppingType.EXTRAMEAT, 1.50),
    CHICKEN_EXTRA(ToppingType.EXTRAMEAT, 1.50),

    //CHEESE
    AMERICAN(ToppingType.MEDIUM, 2.25),
    PROVOLONE(ToppingType.MEDIUM, 2.25),
    CHEDDAR(ToppingType.MEDIUM, 2.25),
    SWISS(ToppingType.MEDIUM, 2.25),

    AMERICAN_EXTRA(ToppingType.EXTRACHEESE, 0.90),
    PROVOLONE_Extra(ToppingType.EXTRACHEESE, 0.90),
    CHEDDAR_EXTRA(ToppingType.EXTRACHEESE, 0.90),
    SWISS_EXTRA(ToppingType.EXTRACHEESE, 0.90);

    private final ToppingType type;
    private final double price;

    ToppingLarge(ToppingType type, double price) {
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
