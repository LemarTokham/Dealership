public class Main {
    public static void main(String[] args) {
        // Create Car
        Car car1 = new Car();
        // Create Dealership
        Dealership dealership = new Dealership();
        // add Car to Dealership
        dealership.addVehicle(car1);
        // display all Cars in Dealership
        dealership.showInventory();
        car1.sound();
        // Add Bike to Dealership

    }
}