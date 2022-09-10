public class Vehicle {
    private int milesPerGallon;
    private double gallonsOfGas;
    private int odometer;

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public double getGallonsOfGas() {
        return gallonsOfGas;
    }

    public void setGallonsOfGas(double gallonsOfGas) {
        this.gallonsOfGas = gallonsOfGas;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public void go(int milesDriven) {
        setGallonsOfGas(getGallonsOfGas() - (milesDriven / getMilesPerGallon()));
        setOdometer(getOdometer() + milesDriven);
    }
}