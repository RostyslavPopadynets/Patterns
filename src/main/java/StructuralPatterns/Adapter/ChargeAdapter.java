package StructuralPatterns.Adapter;

public class ChargeAdapter implements USCharge {

    private EuroCharge euroCharge;

    public ChargeAdapter(EuroCharge euroCharge) {
        this.euroCharge = euroCharge;
    }

    @Override
    public String charge() {
        return this.euroCharge.charge();
    }
}
