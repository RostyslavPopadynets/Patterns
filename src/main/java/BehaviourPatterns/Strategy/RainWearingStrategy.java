package BehaviourPatterns.Strategy;

public class RainWearingStrategy implements WearingStrategy {

    @Override
    public String getClothes() {
        return "Jacket";
    }

    @Override
    public String getAccessories() {
        return "umbrella";
    }

}
