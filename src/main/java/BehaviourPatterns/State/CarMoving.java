package BehaviourPatterns.State;

public class CarMoving implements CarState {

    @Override
    public void openWindow() {
        System.out.println("The window is being opened ...");
    }

    @Override
    public void openDoor() {
        System.out.println("Can't open the door while moving!");
    }
}
