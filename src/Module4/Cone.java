package Module4;

import java.math.BigDecimal;

public class Cone extends Shape {
    private double radius;
    private double height;

    /**
     * Constructor: creates a new Cone object with the given radius and height
     * @param radius the radius of the Cone
     * @param height the height of the Cone
     */
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * Computes the surface area of the Cone
     * @return the surface area of the Cone
     */
    @Override
    public double surfaceArea() {
        return (Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2))));
    }

    /**
     * Computes the volume of the Cone
     * @return the volume of the Cone
     */
    @Override
    public double volume() {
        return ((1.0/3.0) * Math.PI * Math.pow(radius, 2) * height);
    }

    /**
     * Formats a string with the Cone's surface area and volume
     * @return a string representation of the Cone's characteristics
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

        result.append("Cone surface area:\t\t" + surfaceArea + " units^2\n");
        result.append("Cone volume:\t\t\t" + volume + " units^3");

        return result.toString();
    }
}
