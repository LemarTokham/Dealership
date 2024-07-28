public class Bike extends Vehicle {
    // Private attributes
    private final int engineDisplacement;
    public Bike(String make, String model, int year, int engineDisplacement) {
        super(make, model, year);
        this.engineDisplacement = engineDisplacement;
    }

    @Override
    public String getVehicleType() {
        return  "Bike";
    }

    @Override
    public String displayInfo() {
        return getVehicleType() + ": " + make + "\nModel: " + model + "\nYear: " + year + "\nCC: " + engineDisplacement;
    }
}