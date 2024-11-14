package com.pluralsight;

public enum BreadType {
    WHITE, WHEAT, RYE, WRAP;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
