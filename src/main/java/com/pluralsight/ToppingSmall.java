package com.pluralsight;

public enum ToppingSmall {


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
    HAM(ToppingType.SMALL, 1.00),
    STEAK(ToppingType.SMALL, 1.00),
    BACON(ToppingType.SMALL, 1.00),
    SALAMI(ToppingType.SMALL, 1.00),
    ROASTBEEF(ToppingType.SMALL, 1.00),
    CHICKEN(ToppingType.SMALL, 1.00),

    //Extra meat
    HAM_EXTRA(ToppingType.EXTRAMEAT, 0.50),
    STEAK_EXTRA(ToppingType.EXTRAMEAT, 0.50),
    BACON_EXTRA(ToppingType.EXTRAMEAT, 0.50),
    SALAMI_EXTRA(ToppingType.EXTRAMEAT, 0.50),
    ROASTBEEF_EXTRA(ToppingType.EXTRAMEAT, 0.50),
    CHICKEN_EXTRA(ToppingType.EXTRAMEAT, 0.50),

    //CHEESE
    AMERICAN(ToppingType.SMALL, 0.75),
    PROVOLONE(ToppingType.SMALL, 0.75),
    CHEDDAR(ToppingType.SMALL, 0.75),
    SWISS(ToppingType.SMALL, 0.75),

    AMERICAN_EXTRA(ToppingType.EXTRACHEESE, 0.30),
    PROVOLONE_Extra(ToppingType.EXTRACHEESE, 0.30),
    CHEDDAR_EXTRA(ToppingType.EXTRACHEESE, 0.30),
    SWISS_EXTRA(ToppingType.EXTRACHEESE, 0.30);









    private final ToppingType type;
    private final double price;

    ToppingSmall(ToppingType type, double price) {
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
