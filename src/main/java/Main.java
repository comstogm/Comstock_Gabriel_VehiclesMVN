import javax.swing.*;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Vehicle> allVehicles = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("In vehicles Main");
        promptUser();
        displayOutput();
    }

    public static void promptUser() {
        int goAgain = JOptionPane.NO_OPTION;
        do {

            String nickname = JOptionPane.showInputDialog("What would you like to name this vehicle? ");

            Vehicle vehicle = new Vehicle();
            String strMilesPerGallon = JOptionPane.showInputDialog("Enter miles per Gallon");
            int milesPerGallon = Integer.parseInt(strMilesPerGallon);

            String strGallonsOfGas = JOptionPane.showInputDialog("Enter Gallons of gas");
            double gallonsOfGas = Double.parseDouble(strGallonsOfGas);

            String strOdometer = JOptionPane.showInputDialog("Enter the current odometer");
            int odometer = Integer.parseInt(strOdometer);
            vehicle.setGallonsOfGas(gallonsOfGas);
            vehicle.setMilesPerGallon(milesPerGallon);
            vehicle.setOdometer(odometer);
            allVehicles.add(vehicle);

/*            Vehicle yourVehicle = new Vehicle();
            yourVehicle.setGallonsOfGas(8.0);
            yourVehicle.setMilesPerGallon(25);
            yourVehicle.setOdometer(10000);
            allVehicles.add(yourVehicle);

            Vehicle thirdVehicle = new Vehicle();
            thirdVehicle.setGallonsOfGas(12.0);
            thirdVehicle.setMilesPerGallon(15);
            thirdVehicle.setOdometer(20000);
            allVehicles.add(thirdVehicle);*/

            goAgain = JOptionPane.showConfirmDialog(null,
                    "Do you want to add another vehicle?", "Go again?",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        }   while(goAgain == JOptionPane.YES_OPTION);
    }
    private static void displayOutput() {
        do {
            String strMilesDriven = JOptionPane.showInputDialog("How far do you want to go?");
            int milesDriven = Integer.parseInt(strMilesDriven);
            for (Vehicle vehicle : allVehicles) {
                vehicle.setGallonsOfGas(vehicle.getGallonsOfGas() - (milesDriven / vehicle.getMilesPerGallon()));
                vehicle.setOdometer(vehicle.getOdometer() + milesDriven);
                System.out.println("Odometer: " + vehicle.getOdometer() + " | Gallons of Gas: "
                        + vehicle.getGallonsOfGas());
            }
        } while(JOptionPane.showConfirmDialog(null,
                "Do you want to enter another trip?", "Go again?",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION);

    }
}