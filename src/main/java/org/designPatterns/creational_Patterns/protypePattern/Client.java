package org.designPatterns.creational_patterns.protypePattern;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Shape circle1 = new Circle("RED", true, 0.5);
        // The previous line will create a new instance and the printing statement in the shape constructor will be executed.
        System.out.println(circle1);

        Shape circle2 = circle1.clone();
        System.out.println(circle2);
        // But this line will not create a new instance like the first line.
        // So, the printing statement in the shape constructor will not be executed.
        // It's just a copy

        circle1.setColor("GREED"); // I will change the color of the first instance to check the uniqueness of these 2 objects
        System.out.println(circle1);
        System.out.println(circle2);
    }
}
