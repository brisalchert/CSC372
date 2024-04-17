package Module1;

public class Manager extends Employee {
    private String department;

    /**
     * Constructor: Calls constructor from superclass Employee
     */
    public Manager() {
        super();
    }

    /**
     * Gets the department of the manager
     * @return the department field
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department of the manager
     * @param department the String to assign to the field department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Prints all manager info, calling the superclass method and adding manager info
     */
    @Override
    public void employeeSummary() {
        super.employeeSummary();
        System.out.println("\tDepartment : " + department);
    }
}
