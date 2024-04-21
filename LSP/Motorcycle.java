package LSP;


/*
 * The Motorcycle class represents another specific type of vehicle, also inheriting from the Vehicle class.
 * It overrides the startEngine() method to start a motorcycle engine.
 */

public class Motorcycle extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }
    
}
