package Prototype;

public class SmartPhone implements Cloneable {
    private String name;
    private String memory;
    private OS os;

    public SmartPhone() {
    }

    public SmartPhone(SmartPhone smartPhone) {
        this.name = smartPhone.name;
        this.memory = smartPhone.memory;
        this.os = smartPhone.os;
    }

    public SmartPhone clone() {
        return new SmartPhone(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Name : " + name + "\n" +
                "Memory : " + memory + "\n" +
                "OS : " + os + "\n";
    }
}
