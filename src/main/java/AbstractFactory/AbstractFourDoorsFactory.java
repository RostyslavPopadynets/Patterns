package AbstractFactory;

public class AbstractFourDoorsFactory implements AbstractCarFactory {
    @Override
    public Audi getAudi() {
        return new Audi("A4", 4);
    }

    @Override
    public BMW getBMW() {
        return new BMW("720", 4);
    }
}
