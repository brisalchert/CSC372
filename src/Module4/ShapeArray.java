package Module4;

public class ShapeArray {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(4.0);
        Cylinder cylinder = new Cylinder(3.5, 7.5);
        Cone cone = new Cone(2.0, 10.2);
        Shape[] shapeArray = {sphere, cylinder, cone};

        // Print header text
        System.out.println("SHAPE INFO:");
        System.out.println("------------------------------------------");

        // Print information for each shape
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
            System.out.println();
        }
    }
}
