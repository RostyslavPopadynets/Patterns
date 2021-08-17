package GeneratingPatterns.Builder;

public class IngredientBuilder {
    private Ingredients ingredients;

    public static IngredientBuilder builder() {
        return new IngredientBuilder();
    }

    private IngredientBuilder() {
        this.ingredients = new Ingredients();
    }

    public Ingredients build() {
        return this.ingredients;
    }

    public IngredientBuilder corn(boolean corn) {
        this.ingredients.setCorn(corn);
        return this;
    }

    public IngredientBuilder ananas(boolean ananas) {
        this.ingredients.setAnanas(ananas);
        return this;
    }

    public IngredientBuilder chiken(boolean chiken) {
        this.ingredients.setChiken(chiken);
        return this;
    }

    public IngredientBuilder lem(boolean lem) {
        this.ingredients.setLem(lem);
        return this;
    }

    public IngredientBuilder biff(boolean biff) {
        this.ingredients.setBiff(biff);
        return this;
    }

    public IngredientBuilder chess(boolean chess) {
        this.ingredients.setChess(chess);
        return this;
    }

    public IngredientBuilder rukula(boolean rukula) {
        this.ingredients.setRukula(rukula);
        return this;
    }
}
