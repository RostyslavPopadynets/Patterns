package GeneratingPatterns.AbstractFactory;

public abstract class Car {
    private String model;
    private int doorsNumber;

    protected Car(String model, int doorsNumber) {
        this.model = model;
        this.doorsNumber = doorsNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public String getModl() {
        return this.model;
    }

    public int getDoorsNumber() {
        return this.doorsNumber;
    }
}
