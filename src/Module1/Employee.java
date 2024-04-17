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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void employeeSummary() {
        System.out.println("Info for employee with ID: " + employeeID);
        System.out.println("---------------------------------------------");
        System.out.println("\tFirst Name: " + firstName);
        System.out.println("\tLast Name: " + lastName);
        System.out.println("\tSalary: " + salary);
    }
}
