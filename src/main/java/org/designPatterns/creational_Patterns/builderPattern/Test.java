package org.designPatterns.creational_patterns.builderPattern;

public class Test {
    public static void main(String[] args) {
        // Using the Builder to construct a Car object
        Car car = new Car
                .Builder()
                .setBrand("Toyota")
                .setModel("Camry")
                .setYear(2022)
                .setHorsepower(203)
                .build();

        // Accessing the attributes of the constructed Car object
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Horsepower: " + car.getHorsepower());

    }
}
