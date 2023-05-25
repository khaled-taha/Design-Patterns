package org.designPatterns.creational_Patterns.builderPattern;

// Product class
public class Car {
    private String brand;
    private String model;
    private int year;
    private int horsepower;

    // Constructor is private to enforce the use of the builder
    private Car() {
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getHorsepower() {
        return horsepower;
    }

    // Builder class
    public static class Builder {
        private String brand;
        private String model;
        private int year;
        private int horsepower;

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setHorsepower(int horsepower) {
            this.horsepower = horsepower;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.brand = this.brand;
            car.model = this.model;
            car.year = this.year;
            car.horsepower = this.horsepower;
            return car;
        }
    }
}
