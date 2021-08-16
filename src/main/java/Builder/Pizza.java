package Builder;

public class Pizza {
    private int size;
    private Ingredients ingredients;
    private String sauce;

    public Pizza(int size, Ingredients ingredients, String sauce) {
        this.size = size;
        this.ingredients = ingredients;
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "Pizza :\n" +
                "size : " + size + " cen.,\n" +
                "Ingredients : \n" + ingredients +
                "Sauce : " + sauce;
    }
}
