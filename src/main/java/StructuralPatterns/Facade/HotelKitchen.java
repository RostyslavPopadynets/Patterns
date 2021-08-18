package StructuralPatterns.Facade;

public class HotelKitchen {

    public int getKitchenPrice(int personCount, int mealCount) {
        switch (mealCount) {
            case 1:
                return personCount * 100;
            case 2:
                return personCount * 150;
            case 3:
                return personCount * 200;
            default:
                return personCount * 100;
        }
    }

}
