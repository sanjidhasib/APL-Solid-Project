package LSP;

//*************************************************************************

// Title : A java programme to demonstrate Liskov Substitution Principle (LSP).
// Author : Sanjidul Hasan Hasib, Undergrduate student, Khulna University.
//*


public class Main {

    public static void main(String[] args) {
        // Create instances of Car and Motorcycle
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        // Start the engine of both vehicles
      car.startEngine();
      motorcycle.startEngine();
    }
    
}
/*
 * As per Liskov Substitution
 * Principle (LSP)
 * Any subclasses can be substituted for their base class without
 * altering
 * the behavior of the program.
 */
 