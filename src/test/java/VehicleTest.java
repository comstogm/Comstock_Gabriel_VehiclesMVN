import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    private Vehicle vehicle;

    @Test
    public void go_increase_OdometerBy100AndDecreaseGallonsOfGasBy5WhenMilesPerGallonIs20() {
        /*
        G-W-T
        Given: Preconditions/Assumptions at the start
        When: Steps that we take
        Then: Where we have our asserts; What should have happened
        */
        givenVehicleHas0Odometer15GallonsOfGasAnd20MilesPerGallon();
        whenDrive100();
        thenOdometerIncreasesBy100AndGallonsOfGasDecreasesBy5();
    }

    private void givenVehicleHas0Odometer15GallonsOfGasAnd20MilesPerGallon() {
        vehicle = new Vehicle();
        vehicle.setOdometer(0);
        vehicle.setGallonsOfGas(15);
        vehicle.setMilesPerGallon(20);

    }

    private void whenDrive100() {
        vehicle.go(100);

    }

    private void thenOdometerIncreasesBy100AndGallonsOfGasDecreasesBy5() {
        assertEquals(100, vehicle.getOdometer());
        assertEquals(10, vehicle.getGallonsOfGas());
    }

}
