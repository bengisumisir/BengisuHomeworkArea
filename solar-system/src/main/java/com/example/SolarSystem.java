package com.example;

public class SolarSystem {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.println(planet);
        }
    }
}

