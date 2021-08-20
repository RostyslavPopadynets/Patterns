package BehaviourPatterns.ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class BestFriend extends CafeVisitor {

    private List<Food> coffeeContainingFood;

    public BestFriend(CafeVisitor cafeVisitor) {
        super(cafeVisitor);
        coffeeContainingFood = new ArrayList<>();
    }

    public void handleFood(Food food) {
        if(food.getIngredients().contains("Meat")) {
            System.out.println("Best friend: I just ate " + food.getName() + ". It was tasty.");
            return;
        }
        if (food.getIngredients().contains("Coffee") && coffeeContainingFood.size() < 1) {
            coffeeContainingFood.add(food);
            System.out.println("Best friend: I have to take something with coffee. " + food.getName() +
                    " looks fine.");
            return;
        }
        super.handleFood(food);
    }
}
