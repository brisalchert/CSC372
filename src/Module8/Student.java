package Module8;

public class Student {
    private String name;
    private String address;
    private double gpa;

    /**
     * Constructor: Creates a new Student object with a name, address, and gpa
     * @param name the Student's name
     * @param address the Student's address
     * @param gpa the Student's gpa
     */
    public Student(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    /**
     * Gets the Student's name
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the Student's name to a new String
     * @param name the new name for the Student
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the Student's address
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the Student's address to a new String
     * @param address the new address for the Student
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the Student's gpa
     * @return the gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * Sets the Student's gpa to a new double
     * @param gpa the new gpa for the student
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
