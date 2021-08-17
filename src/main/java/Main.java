import AbstractFactory.AbstractCarFactory;
import AbstractFactory.AbstractFourDoorsFactory;
import AbstractFactory.AbstractTwoDoorsFactory;
import Builder.IngredientBuilder;
import Builder.Ingredients;
import Builder.Pizza;
import FactoryMethod.Toy;
import FactoryMethod.ToyFactory;
import FactoryMethod.ToyType;

public class Main {

    public static void main(String[] args) {
        abstractFactoryPattern();
        builderPattern();
        factoryMethodPattern();
    }

    private static void factoryMethodPattern() {
        Toy toyCat = ToyFactory.getToy(ToyType.CAT);
        Toy toyDog = ToyFactory.getToy(ToyType.DOG);

        // Should say hello and goodbye from CatToy class
        System.out.println("CAT:");
        System.out.println(toyCat.sayHello());
        System.out.println(toyCat.sayGoodbye());

        // Should say hello and goodbye from DogToy class
        System.out.println("DOG:");
        System.out.println(toyDog.sayHello());
        System.out.println(toyDog.sayGoodbye());
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
