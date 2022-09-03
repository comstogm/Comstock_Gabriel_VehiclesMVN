import java.util.ArrayList;
import java.util.List;

public class Main {

    private static ArrayList<Vehicle> allVehicles = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("In vehicles Main");
        System.out.println("Second line");

        Vehicle myVehicle = new Vehicle();
        myVehicle.setGallonsOfGas(10.0);
        myVehicle.setMilesPerGallon(20);
        myVehicle.setOdometer(0);
        allVehicles.add(myVehicle);

        Vehicle yourVehicle = new Vehicle();
        yourVehicle.setGallonsOfGas(8.0);
        yourVehicle.setMilesPerGallon(25);
        yourVehicle.setOdometer(10000);
        allVehicles.add(yourVehicle);

        Vehicle thirdVehicle = new Vehicle();
        thirdVehicle.setGallonsOfGas(12.0);
        thirdVehicle.setMilesPerGallon(15);
        thirdVehicle.setOdometer(20000);
        allVehicles.add(thirdVehicle);


        drive(100);
        drive(60);
    }

    private static void drive(int milesDriven) {
        for (Vehicle vehicle: allVehicles) {
            vehicle.setGallonsOfGas(vehicle.getGallonsOfGas() - (milesDriven / vehicle.getMilesPerGallon()));
            vehicle.setOdometer(vehicle.getOdometer() + milesDriven);
            System.out.println("Odometer: " + vehicle.getOdometer() + " | Gallons of Gas: " + vehicle.getGallonsOfGas());
        }

    }
}