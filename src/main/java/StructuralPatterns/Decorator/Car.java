package StructuralPatterns.Decorator;

public class Car {

    protected String owner;
    protected String carModel;

    public void drive() {
        System.out.println("Car " + carModel + " is driving by " + owner);
    }
}
