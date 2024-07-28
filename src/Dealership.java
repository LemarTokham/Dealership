import java.util.ArrayList;
import java.util.List;

public class Dealership {
    List<Vehicle> inventory = new ArrayList<Vehicle>();

    void addVehicle(Vehicle v) {
        inventory.add(v);
    }
    void removeVehicle(Vehicle v) {
        inventory.remove(v);
    }
    void showInventory() {
        int i = 1;
        for (Vehicle v : inventory) {
            System.out.println("________________");
            System.out.println("Vehicle " + i + ":");
            System.out.println(v.displayInfo());
            i ++;
        }
    }
}