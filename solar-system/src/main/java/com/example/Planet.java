package com.example;

public enum Planet {
    MERCURY(1, 57.91, 2439.7, 1407.6),
    VENUS(2, 108.21, 6051.8, 5832.5),
    EARTH(3, 149.6, 6371, 24),
    MARS(4, 227.92, 3389.5, 24.6),
    JUPITER(5, 778.57, 69911, 9.9),
    SATURN(6, 1433.5, 58232, 10.7),
    URANUS(7, 2872.5, 25362, 17.2),
    NEPTUNE(8, 4495.1, 24622, 16.1);

    private final int order; // Order from the Sun
    private final double distance; // Distance from the Sun (in million km)
    private final double radius; // Radius (in km)
    private final double rotationPeriod; // Rotation period (in hours)

    Planet(int order, double distance, double radius, double rotationPeriod) {
        this.order = order;
        this.distance = distance;
        this.radius = radius;
        this.rotationPeriod = rotationPeriod;
    }

    public int getOrder() {
        return order;
    }

    public double getDistance() {
        return distance;
    }

    public double getRadius() {
        return radius;
    }

    public double getRotationPeriod() {
        return rotationPeriod;
    }

    @Override
    public String toString() {
        return "Planet: " + name() +
               ", Order: " + order +
               ", Distance: " + distance + " million km" +
               ", Radius: " + radius + " km" +
               ", Rotation Period: " + rotationPeriod + " hours";
    }
}

