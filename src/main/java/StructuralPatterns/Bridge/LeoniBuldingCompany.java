package StructuralPatterns.Bridge;

public class LeoniBuldingCompany implements BuildingCompany {

    private WallCreator wallCreator;

    public LeoniBuldingCompany(WallCreator wallCreator) {
        this.wallCreator = wallCreator;
    }

    @Override
    public void buildFoundation() {
        System.out.println("Build foundation is done.");
    }

    @Override
    public void buildRoom() {
        wallCreator.buildWallWithWindow();
        wallCreator.buildWallWithDoor();
        wallCreator.buildWall();
        System.out.println("Build room is done.");
    }

    @Override
    public void buildRoof() {
        System.out.println("Build roof is done.");
    }

    public WallCreator getWallCreator() {
        return wallCreator;
    }

    public void setWallCreator(WallCreator wallCreator) {
        this.wallCreator = wallCreator;
    }
}
