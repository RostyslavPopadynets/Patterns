package BehaviourPatterns.State;

public class CarOn implements CarState {

    @Override
    public void openWindow() {
        System.out.println("The window is being opened ...");
    }

    @Override
    public void openDoor() {
        System.out.println("The door is being opened ...");
    }
}
