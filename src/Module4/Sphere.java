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

    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("Sphere surface area: " + surfaceArea() + "units^2\n");
        result.append("Sphere volume: " + volume() + "units^3");

        return result.toString();
    }
}
