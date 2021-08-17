package FactoryMethod;

public class DogToy implements Toy {
    @Override
    public String sayHello() {
        return "Hello, I am Dog!!!";
    }

    @Override
    public String sayGoodbye() {
        return "Goodbye, I am Dog!!!";
    }
}
