public class Car extends Vehicle {
    private final String make;
    private final String model;
    private final int year;

    // Default Constructor
    public Car(){
        this.make = "Mustang";
        this.model = "GT";
        this.year = 1997;
    }

    // Parameterised Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String displayInfo() {
        return "Make: " + make + "\nModel: " + model + "\nYear: " + year;
    }

}