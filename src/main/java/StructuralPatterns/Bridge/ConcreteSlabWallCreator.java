package StructuralPatterns.Bridge;

public class ConcreteSlabWallCreator implements WallCreator {
    @Override
    public void buildWallWithDoor() {
        System.out.println("Building wall with door by concrete...");
    }

    @Override
    public void buildWallWithWindow() {
        System.out.println("Building wall with window by concrete...");
    }

    @Override
    public void buildWall() {
        System.out.println("Building wall by concrete...");
    }
}
