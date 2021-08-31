package BehaviourPatterns.State;

public class CarOff implements CarState {

    @Override
    public void openWindow() {
        System.out.println("Can't open the window! Switch the car on!");
    }

    @Override
    public void openDoor() {
        System.out.println("The door is being opened ...");
    }
}
