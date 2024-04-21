package LSP;


/*
 * The Car class represents a specific type of vehicle, inheriting from the Vehicle class.
 * It overrides the startEngine() method to start a car engine.
 */

public class Car extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }
    
}
