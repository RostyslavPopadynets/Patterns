package StructuralPatterns.Flyweight;

public class Goblin extends Unit {

    public Goblin() {
        name = "Dragon";
        health = 100;
        picture = UnitImagesFactory.getGoblinImage();
    }

}
