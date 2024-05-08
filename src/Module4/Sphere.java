package Module4;

public class Sphere extends Shape {
    private double radius;

    /**
     * Constructor: creates a new Sphere object with the given radius
     * @param radius the radius of the Sphere
     */
    public Sphere(double radius) {
        this.radius = radius;
    }

    /**
     * Computes the surface area of the Sphere
     * @return the surface area of the Sphere
     */
    @Override
    public double surfaceArea() {
        return (4 * Math.PI * Math.pow(radius, 2));
    }

    /**
     * Computes the volume of the Sphere
     * @return the volume of the Sphere
     */
    @Override
    public double volume() {
        return ((4.0/3.0) * Math.PI * Math.pow(radius, 3));
    }

    /**
     * Formats a string with the Sphere's surface area and volume
     * @return a string representation of the Sphere's characteristics
     */
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append(String.format("Sphere surface area: %13.4f", surfaceArea()) + " units^2\n");
        result.append(String.format("Sphere volume: %19.4f", volume()) + " units^3");

        return result.toString();
    }
}
