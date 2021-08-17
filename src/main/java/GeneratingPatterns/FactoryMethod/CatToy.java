package GeneratingPatterns.FactoryMethod;

public class CatToy implements Toy {
    @Override
    public String sayHello() {
        return "Hello, I am Cat!!!";
    }

    @Override
    public String sayGoodbye() {
        return "Goodbye, I am Cat!!!";
    }
}
