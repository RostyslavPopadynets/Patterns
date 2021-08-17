package GeneratingPatterns.AbstractFactory;

public class AbstractTwoDoorsFactory implements AbstractCarFactory {
    @Override
    public Audi getAudi() {
        return new Audi("A6", 2);
    }

    @Override
    public BMW getBMW() {
        return new BMW("520", 2);
    }
}
