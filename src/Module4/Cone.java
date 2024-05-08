package Module4;

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

        result.append("Cone surface area: " + surfaceArea() + " units^2\n");
        result.append("Cone volume: " + volume() + " units^3");

        return result.toString();
    }
}
