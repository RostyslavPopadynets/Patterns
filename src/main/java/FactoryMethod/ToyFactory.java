package FactoryMethod;

public class ToyFactory {

    public static Toy getToy(ToyType toyType) {
        switch (toyType) {
            case CAT:
                return new CatToy();
            case DOG:
                return new DogToy();
            default:
                return new CatToy();
        }
    }

}
