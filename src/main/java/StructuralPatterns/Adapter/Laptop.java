package StructuralPatterns.Adapter;

public class Laptop {

    public static void chargeLaptop(USCharge usCharge) {
        System.out.println("Charging!!!" + usCharge.charge());
    }

}
