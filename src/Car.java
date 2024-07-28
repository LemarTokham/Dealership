public class Car extends Vehicle {
    // private attributes
    private final int horsepower;
    public Car(String make, String model, int year, int horsepower) {
        super(make, model, year);
        this.horsepower = horsepower;
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }

    @Override
    public String displayInfo() {
        return getVehicleType() + ": " + make + "\nModel: " + model + "\nYear: " + year + "\nHorsepower: " + horsepower;
    }

}