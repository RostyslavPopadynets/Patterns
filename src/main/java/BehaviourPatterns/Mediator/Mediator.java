package BehaviourPatterns.Mediator;

public class Mediator {
    private Fan fan;

    public Mediator(Fan fan) {
        this.fan = fan;
    }

    public void press() {
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }
}
