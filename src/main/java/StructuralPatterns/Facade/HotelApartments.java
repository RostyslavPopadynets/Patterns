package StructuralPatterns.Facade;

public class HotelApartments {

    public int getRoomPrice(int personCount) {
        switch (personCount) {
            case 1:
                return 300;
            case 2:
                return 400;
            case 3:
                return 500;
            default:
                return 300;
        }
    }

}
