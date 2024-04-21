package OCP;


/*
 * The Circle class represents a geometric shape, specifically a circle,
 * and implements the VolumeCalculable interface to calculate its volume.
 */

class Circle implements VolumeCalculable{
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius;
    }
}
