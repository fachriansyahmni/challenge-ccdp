package ac.id.unikom.challenge;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class Meter {
    private double meter;
    private double centimeter;
    private double kilometer;

    public double getMeter() { return meter; }

    public double getCentimeter() {
        return centimeter;
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }

    public void setCentimeter(double centimeter) { this.centimeter = centimeter; }

    public double getKilometer() { return kilometer; }

    public void setKilometer(double kilometer) { this.kilometer = kilometer; }

    public double toKilometer() { return kilometer = meter / 1000; }

    public double toCentimeter() { return centimeter = meter * 100; }
}
