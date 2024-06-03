//----------------------------------------------------------------------------------------------------------------------
//  Write a Java program that incorporates a loop that prompts the user for student data. Student data are private
//  fields in a student class including:
//
//  - String name
//  - String address
//  - double GPA
//
//  Each student object is stored in a linked list. After the user completes the data entry, output the contents of the
//  linked list in ascending sorted order by name to a regular text file that can be opened and viewed using a simple
//  plain-text editor such as notepad.
//
//  Validate numeric data for Grade Point Average (GPA).
//----------------------------------------------------------------------------------------------------------------------

package Module8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FileOutputStream outputStream = null;
        PrintWriter printWriter;
        // Create a LinkedList to store Students
        LinkedList<Student> studentList = new LinkedList<Student>();

        // Get Student data from the user until they choose to exit
        System.out.print("Enter data for a new student? (Y/N): ");
        String userChoice = input.nextLine().toLowerCase();

        while (!userChoice.equals("n")) {
            if (userChoice.equals("y")) {
                String name;
                String address;
                double gpa = 0;

                // Get the Student's name
                System.out.print("Enter student name: ");
                name = input.nextLine();

                // Get the Student's address
                System.out.print("Enter student address: ");
                address = input.nextLine();

                // Get the Student's gpa, validating the input and requesting again on invalid input
                boolean gpaValid = validateGPA(input, gpa);

                while (!gpaValid) {
                    gpaValid = validateGPA(input, gpa);
                }

                // Create a new Student object, add it to the LinkedList, and confirm to the user
                Student student = new Student(name, address, gpa);
                studentList.add(student);

                System.out.println("Student \"" + name + "\" successfully added to list.");
                System.out.println();
            }
            else {
                System.out.println("Invalid input -- please enter Y or N.");
            }

            // Ask if the user wishes to continue processing input
            System.out.print("Enter data for a new student? (Y/N): ");
            userChoice = input.nextLine().toLowerCase();
        }

        input.close();

        System.out.println();

        // Sort the Students in ascending order
        studentList.sort(new NameComparator());

        // Output Student data to text file
        try {
            outputStream = new FileOutputStream("StudentData.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("Error accessing StudentData.txt -- File not found.");
        }

        if (outputStream != null) {
            printWriter = new PrintWriter(outputStream);
            printStudentData(printWriter, studentList);
        }

        System.out.println("Student data successfully exported to StudentData.txt");
    }

    public static boolean validateGPA(Scanner input, double gpa) {
        boolean gpaValid = false;

        System.out.print("Enter student GPA: ");
        try {
            gpa = input.nextDouble();

            // Check that the GPA is within the valid range (0.0 - 4.0)
            if (gpa < 0 || gpa > 4) {
                System.out.println("Invalid input -- GPA must be between 0.0 and 4.0.");
            }
            else {
                gpaValid = true;
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input -- GPA must be a number.");
        }
        finally {
            // Clear the input line for the next iteration of the while loop
            input.nextLine();
        }

        // Return true if a valid gpa was chosen
        return gpaValid;
    }

    public static void printStudentData(PrintWriter printWriter, LinkedList<Student> studentList) {
        printWriter.println("STUDENT DATA (sorted by name):");
        printWriter.println("------------------------------");
        for (Student student : studentList) {
            printWriter.println(student.toString());
            printWriter.println();
        }

        printWriter.close();
    }
}
