package exercicio1.entities;

public class OutsourcedEmployee extends Employee {
    private double additionalCharge; // Alterado para tipo primitivo para evitar null

    public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        if (additionalCharge < 0) {
            throw new IllegalArgumentException("Additional charge cannot be negative");
        }
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        if (additionalCharge < 0) {
            throw new IllegalArgumentException("Additional charge cannot be negative");
        }
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1;
    }
}
