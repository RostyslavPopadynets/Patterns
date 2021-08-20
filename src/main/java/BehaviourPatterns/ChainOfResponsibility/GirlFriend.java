package BehaviourPatterns.ChainOfResponsibility;

public class GirlFriend extends CafeVisitor {

    public GirlFriend(CafeVisitor cafeVisitor) {
        super(cafeVisitor);
    }

    public void handleFood(Food food) {
        if(food.getName() == "Cappuccino")
        {
            System.out.println("GirlFriend: My lovely cappuccino!!!");
        }
        // Базовий виклик base.HandleFood(food) для останнього обробітника-дівчини
        // не має сенсу, тому можна нічого не робити
    }
}
