package BehaviourPatterns.Strategy;

public class DefaultWearingStrategy implements WearingStrategy {

    @Override
    public String getClothes() {
        return "sweater";
    }

    @Override
    public String getAccessories() {
        return "cap";
    }
}
