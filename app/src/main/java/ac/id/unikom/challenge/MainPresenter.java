package ac.id.unikom.challenge;

public class MainPresenter {
    private MainView view;

    public MainPresenter(MainView view) {
        this.view = view;
    }

     public void calculateLength(String meter) {
        if (meter.isEmpty())
            meter = "0";

        Meter model = new Meter();
        double parsedMeter = Double.parseDouble(meter);
        model.setMeter(parsedMeter);

        String centimeter = model.toCentimeter() + "";
        String kilometer = model.toKilometer() + "";

        view.showCentimeter(centimeter);
        view.showKilometer(kilometer);
     }
}
