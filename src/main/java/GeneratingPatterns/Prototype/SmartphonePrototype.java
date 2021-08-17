package GeneratingPatterns.Prototype;

public class SmartphonePrototype {

    public static SmartPhone getExistingSmartPhone() {
        SmartPhone smartphone = new SmartPhone();
        smartphone.setName("Iphone 11 Pro");
        smartphone.setMemory("256GB");
        smartphone.setOs(OS.IOS);
        return smartphone;
    }

}
