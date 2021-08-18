package StructuralPatterns.Facade;

public class HotelFacade {

    private HotelApartments hotelApartments = new HotelApartments();
    private HotelKitchen hotelKitchen = new HotelKitchen();
    private HotelEntertainment hotelEntertainment = new HotelEntertainment();

    public void getAllInclusiveRestPrice(int personCount) {
        System.out.println("All-inclusive rest for " + personCount + " persons: " +
                (hotelApartments.getRoomPrice(personCount) +
                hotelKitchen.getKitchenPrice(personCount, 3) +
                hotelEntertainment.getEntertainmentPrice()) + "$.");
    }

    public void getAllInclusiveRestForOnePerson() {
        System.out.println("All-inclusive rest for 1 person: " +
                (hotelApartments.getRoomPrice(1) +
                hotelKitchen.getKitchenPrice(1, 3) +
                hotelEntertainment.getEntertainmentPrice()) + "$.");
    }

    public void getTheCheaperRestForOnePerson() {
        System.out.println("The cheaper rest for 1 person: " +
                (hotelApartments.getRoomPrice(1) +
                hotelKitchen.getKitchenPrice(1, 0)) + "$.");
    }

}
