package com.pluralsight;

public enum SandWichSize {

        SMALL(4, 5.50),
        MEDIUM(8, 7.00),
        LARGE(12, 8.50),
        DEFAULT(0, 0.00);

        private final int inches;
        private final double basePrice;

        SandWichSize(int inches, double basePrice) {
            this.inches = inches;
            this.basePrice = basePrice;
        }

        public double getBasePrice() {
            return basePrice;
        }

        @Override
        public String toString() {
            return inches + "\"";
        }
}




