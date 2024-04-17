package Module1;

public class EmployeeDriver {
    public static void main(String[] args) {
        // Create an Employee object and a Manager object
        Employee employee = new Employee();
        Manager manager = new Manager();

        // Set fields for object instances
        employee.setEmployeeID(4025);
        employee.setFirstName("John");
        employee.setLastName("Smith");
        employee.setSalary(50000.0);

        manager.setEmployeeID(8206);
        manager.setFirstName("Emma");
        manager.setLastName("Williams");
        manager.setSalary(86000.0);
        manager.setDepartment("Engineering");

        // Print info for object instances
        employee.employeeSummary();

        System.out.println();

        manager.employeeSummary();
    }
}
