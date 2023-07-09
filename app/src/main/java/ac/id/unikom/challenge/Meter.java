package ac.id.unikom.challenge;

public class Meter {
    private double meter;
    private double centimeter;
    private double kilometer;

    public void setMeter(double meter) {
        this.meter = meter;
    }

    public double toCentimeter() {
        return meter * 100;
    }

    public double toKilometer() {
        return meter / 1000;
    }
}
