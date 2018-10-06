package com.infoshare.refactoring._1_smells._7_switches.example;

public class Bird {

    private static final double AFRICAN_SPEED_FACTOR = 1.3;
    private static final double NORTH_NORWAY_SPEED_FACTOR = 0.7;

    private final BirdType type;
    private final double baseSpeed;
    private final boolean isFromNorthNorway;

    public Bird(double baseSpeed, boolean isFromNorthNorway, BirdType type) {
        this.type = type;
        this.baseSpeed = baseSpeed;
        this.isFromNorthNorway = isFromNorthNorway;
    }

    public double getSpeed() {
        switch (type) {
            case EUROPEAN: return baseSpeed;
            case AFRICAN: return baseSpeed * AFRICAN_SPEED_FACTOR;
            case NORWEGIAN: {
                if (isFromNorthNorway) {
                    return baseSpeed * NORTH_NORWAY_SPEED_FACTOR;
                }
                return baseSpeed;
            }
        }

        throw new RuntimeException("Unknown bird type");
    }
}
