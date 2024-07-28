public class Main {
    public static void main(String[] args) {
        // Create Car
        Car car1 = new Car("Mustang", "GT", 1967, 543);
        // Create Dealership
        Dealership dealership = new Dealership();
        // add Car to Dealership
        dealership.addVehicle(car1);
        // Add Bike to Dealership
        Bike bike1 = new Bike("Yamaha", "R1", 2005, 25);
        dealership.addVehicle(bike1);

        // display all Cars in Dealership
        dealership.showInventory();
    }
}