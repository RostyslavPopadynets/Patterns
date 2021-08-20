package BehaviourPatterns.ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class Food {

    private List<String> ingredients;
    private String name;

    public Food(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getName() {
        return name;
    }
}
