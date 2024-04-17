package Module1;

public class Manager extends Employee {
    private String department;

    /**
     * Constructor: Calls constructor from superclass Employee
     */
    public Manager() {
        super();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void employeeSummary() {
        super.employeeSummary();
        System.out.println("\tDepartment : " + department);
    }
}
