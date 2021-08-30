package BehaviourPatterns.Mediator;

public class Fan {
    private PowerSupplier powerSupplier;
    private boolean isOn;

    public Fan(PowerSupplier powerSupplier) {
        this.powerSupplier = powerSupplier;
        this.isOn = false;
    }

    public void turnOn() {
        start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        stop();
    }

    public boolean isOn() {
        return isOn;
    }

    public void start() {
        powerSupplier.turnOn();
    }

    public void stop() {
        powerSupplier.turnOff();
    }
}
