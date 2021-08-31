package BehaviourPatterns.Strategy;

public class SunshineWearingStrategy implements WearingStrategy {

    @Override
    public String getClothes() {
        return "T-Shirt";
    }

    @Override
    public String getAccessories() {
        return "sunglasses";
    }
}
