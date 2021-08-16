import AbstractFactory.AbstractCarFactory;
import AbstractFactory.AbstractFourDoorsFactory;
import AbstractFactory.AbstractTwoDoorsFactory;
import Builder.IngredientBuilder;
import Builder.Ingredients;
import Builder.Pizza;

public class Main {

    public static void main(String[] args) {
        abstractFactoryPattern();
        builderPattern();
    }

    private static void builderPattern() {
        Ingredients ingredients = IngredientBuilder.builder()
                .ananas(true)
                .biff(true)
                .corn(true)
                .lem(true)
                .build();
        Pizza pizza = new Pizza(50, ingredients, "barbecue");
        // pizza should have ananas, biff, corn and lem values as true, others - as false
        System.out.println(pizza);
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
