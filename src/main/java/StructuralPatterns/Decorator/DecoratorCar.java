package StructuralPatterns.Decorator;

public class DecoratorCar extends Car {
    protected Car decoderCar;

    public DecoratorCar(Car decoderCar) {
        this.decoderCar = decoderCar;
    }

    @Override
    public void drive() {
        decoderCar.drive();
        System.out.println("Additional flow.");
    }
}
