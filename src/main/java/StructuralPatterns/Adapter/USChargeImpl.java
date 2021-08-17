package StructuralPatterns.Adapter;

public class USChargeImpl implements USCharge {
    @Override
    public String charge() {
        return "180V";
    }
}
