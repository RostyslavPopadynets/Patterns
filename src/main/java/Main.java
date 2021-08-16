import AbstractFactory.AbstractCarFactory;
import AbstractFactory.AbstractFourDoorsFactory;
import AbstractFactory.AbstractTwoDoorsFactory;

public class Main {

    public static void main(String[] args) {
        abstractFactoryPattern();
    }

    private static void abstractFactoryPattern() {
        System.out.println("AbstractCarFactory\n");
        AbstractCarFactory twoDoorsFactory = new AbstractTwoDoorsFactory();
        AbstractCarFactory fourDoorsFactory = new AbstractFourDoorsFactory();

        // Both should return 2
        System.out.println("TwoDoorsFactory");
        System.out.println("Audi doors number: " + twoDoorsFactory.getAudi().getDoorsNumber());
        System.out.println("BMW doors number: " + twoDoorsFactory.getBMW().getDoorsNumber());

        // Both should return 4
        System.out.println("\nFourDoorsFactory");
        System.out.println("Audi doors number: " + fourDoorsFactory.getAudi().getDoorsNumber());
        System.out.println("BMW doors number: " + fourDoorsFactory.getBMW().getDoorsNumber());
        System.out.println("\n");
    }
}
