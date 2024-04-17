//----------------------------------------------------------------------------------------------------------------------
//  Option #2:  Implementing a Superclass Employee
//  Part 1: Implement a superclass Employee that has the following fields and methods.
//
//    Fields:
//      string firstName
//      string lastName
//      int employeeID
//      double salary
//
//    Methods:
//      constructor method -   initialize salary field to zero.
//      setters and getters for firstName, lastName, and employeeID
//      employeeSummary method - prints all account attributes
//
//  Part 2: Implement a Manager class that inherits from the Employee class.
//
//    Fields:
//      string department
//
//    Methods:
//      employeeSummary method - prints all superclass and subclass attributes
//
//  Ensure that your program has the two required classes and a test class.
//----------------------------------------------------------------------------------------------------------------------

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
