package BehaviourPatterns.Strategy;

public class Myself {

    private WearingStrategy wearingStrategy;

    public Myself() {
        wearingStrategy = new DefaultWearingStrategy();
    }

    public void changeStrategy(WearingStrategy wearingStrategy) {
        this.wearingStrategy = wearingStrategy;
    }
    public void goOutside() {
        String clothes = wearingStrategy.getClothes();
        String accessories = wearingStrategy.getAccessories();
        System.out.println("Today I wore " + clothes + " and took " + accessories);
    }


}
