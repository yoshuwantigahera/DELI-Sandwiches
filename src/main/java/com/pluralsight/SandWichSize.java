package com.pluralsight;

public enum SandWichSize {


        SMALL(4, 5.50),
        MEDIUM(8, 7.00),
        LARGE(12, 8.50),
        DEFAULT(0, 0.0);

        private final int inches;
        private final double basePrice;

        SandWichSize(int inches, double basePrice) {
            this.inches = inches;
            this.basePrice = basePrice;
        }

        public int getInches() {
            return inches;
        }

        public double getBasePrice() {
            return basePrice;
        }
    }



