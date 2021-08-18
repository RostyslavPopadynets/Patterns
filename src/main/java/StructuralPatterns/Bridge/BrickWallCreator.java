package StructuralPatterns.Bridge;

public class BrickWallCreator implements WallCreator {
    @Override
    public void buildWallWithDoor() {
        System.out.println("Building wall with door by bricks...");
    }

    @Override
    public void buildWallWithWindow() {
        System.out.println("Building wall with window by bricks...");
    }

    @Override
    public void buildWall() {
        System.out.println("Building wall by bricks...");
    }
}
