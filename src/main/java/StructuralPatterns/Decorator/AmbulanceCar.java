package StructuralPatterns.Decorator;

public class AmbulanceCar extends DecoratorCar {


    public AmbulanceCar(Car decoderCar) {
        super(decoderCar);
    }

    @Override
    public void drive() {
        super.drive();
    }
}
