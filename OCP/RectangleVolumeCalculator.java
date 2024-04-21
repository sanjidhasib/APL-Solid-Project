package OCP;

public class RectangleVolumeCalculator implements VolumeCalculable {

    private double length;
    private double width;
    private double height;

    // Constructor
    public RectangleVolumeCalculator(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return length * width * height;
        
    }
    
}
