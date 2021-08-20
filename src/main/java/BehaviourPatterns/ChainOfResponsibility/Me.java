package BehaviourPatterns.ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class Me extends CafeVisitor {

    private List<Food> coffeeContainingFood;

    public Me(CafeVisitor cafeVisitor) {
        super(cafeVisitor);
        coffeeContainingFood = new ArrayList<>();
    }

    public void handleFood(Food food) {
        if(food.getIngredients().contains("Potato")) {
            System.out.println("Me: I just ate " + food.getName() + ". It was tasty.");
            return;
        }
        if (food.getIngredients().contains("Coffee") && !food.getIngredients().contains("Sugar")
                && coffeeContainingFood.size() < 1) {
            coffeeContainingFood.add(food);
            System.out.println("Me: I have to take something with coffee. " + food.getName() +
                    " looks fine.");
            return;
        }
        super.handleFood(food);
    }

}
