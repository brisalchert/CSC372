package Module1;

public class Employee {
    protected String firstName;
    protected String lastName;
    protected int employeeID;
    protected double salary;

    /**
     * Constructor: Sets initial salary to $0.00
     */
    public Employee() {
        salary = 0.0;
    }

    /**
     * Gets the first name of the employee
     * @return the firstName field
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the employee
     * @param firstName the String to assign to the field firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the employee
     * @return the lastName field
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the employee
     * @param lastName the String to assign to the field lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the ID of the employee
     * @return the employeeID field
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the ID of the employee
     * @param employeeID the int to assign to the field employeeID
     */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * Gets the salary of the employee
     * @return the salary field
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the salary of the employee
     * @param salary the double to assign to the field salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Prints a summary of all employee info
     */
    public void employeeSummary() {
        System.out.println("Info for employee with ID: " + employeeID);
        System.out.println("---------------------------------------------");
        System.out.println("\tFirst Name: " + firstName);
        System.out.println("\tLast Name: " + lastName);
        System.out.println("\tSalary: $" + salary);
    }
}
