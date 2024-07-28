abstract class Vehicle {
    // Protected attributes
    protected final String make;
    protected final String model;
    protected final int year;

    // General constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // abstract method
    public abstract String displayInfo();

    public void sound(){
        System.out.println("vroom vroom");
    }

    public abstract String getVehicleType();
}