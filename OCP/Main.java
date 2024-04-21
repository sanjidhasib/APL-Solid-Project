package OCP;


//*************************************************************************
// Title : A java programme to demonstrate Open Close Principle.
// Author : Sanjidul Hasan Hasib, Undergrduate student, Khulna University.
//*

/*
 * The Main class demonstrates the Open/Closed Principle (OCP) by utilizing
 * the VolumeCalculable interface for calculating the volume of different shapes.
 */

public class Main {
    public static void main(String[] args) {
        RectangleVolumeCalculator rectangle = new RectangleVolumeCalculator(5.0, 6.0, 2.0);
      
        Circle circle = new Circle(5);

        System.out.println("Volume of the rectangle: " + rectangle.calculateVolume());
        System.out.println("Volume of the circle: " + circle.calculateVolume());
    }
    
}



/*
 * New shapes can be added without altering existing code,
 * we use a special way to calculate volume, we can add new shapes
 * easily later on.
 * the VolumeCalculable interface for calculating the volume of different
 * shapes.
 * which is the main theme of open closed principal
 */


