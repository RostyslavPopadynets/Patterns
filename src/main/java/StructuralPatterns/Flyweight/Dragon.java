package StructuralPatterns.Flyweight;

public class Dragon extends Unit {

    public Dragon() {
        name = "Dragon";
        health = 100;
        picture = UnitImagesFactory.getDragonImage();
    }

}
