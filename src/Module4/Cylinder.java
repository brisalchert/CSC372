package Module4;

import java.math.BigDecimal;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    /**
     * Constructor: creates a new Cylinder object with the given radius and height
     * @param radius the radius of the Cylinder
     * @param height the height of the Cylinder
     */
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * Computes the surface area of the Cylinder
     * @return the surface area of the Cylinder
     */
    @Override
    public double surfaceArea() {
        return ((2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2)));
    }

    /**
     * Computes the volume of the Cylinder
     * @return the volume of the Cylinder
     */
    @Override
    public double volume() {
        return (Math.PI * Math.pow(radius, 2) * height);
    }

    /**
     * Formats a string with the Cylinder's surface area and volume
     * @return a string representation of the Cylinder's characteristics
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        BigDecimal roundingDecimal;
        double surfaceArea;
        double volume;

        // Round the surface area to 4 places
        roundingDecimal = new BigDecimal(String.format("%.4f", surfaceArea()));
        surfaceArea = roundingDecimal.doubleValue();

        // Round the volume to 4 places
        roundingDecimal = new BigDecimal(String.format("%.4f", volume()));
        volume = roundingDecimal.doubleValue();

        result.append("Cylinder surface area:\t" + surfaceArea + " units^2\n");
        result.append("Cylinder volume:\t\t" + volume + " units^3");

        return result.toString();
    }
}
