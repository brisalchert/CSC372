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

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create a LinkedList to store Students
        LinkedList<Student> studentList = new LinkedList<Student>();

        // Get Student data from the user until they choose to exit
        System.out.print("Enter data for a new student? (Y/N): ");
        String userChoice = input.nextLine().toLowerCase();

        while (!userChoice.equals("n")) {
            if (userChoice.equals("y")) {
                String name;
                String address;
                double gpa;

                // Get the Student's name
                System.out.print("Enter student name: ");
                name = input.nextLine();

                // Get the Student's address
                System.out.print("Enter student address: ");
                address = input.nextLine();

                // Get the Student's gpa, validating the input and requesting again on invalid input
                System.out.print("Enter student GPA: ");
                try {
                    gpa = input.nextDouble();
                }
                catch (InputMismatchException e) {
                    System.out.println("Invalid input -- GPA must be a number.");
                }
                finally {
                    // Clear the input for the next iteration of the loop
                    input.nextLine();
                }
            }
            else {
                System.out.println("Invalid input -- please enter Y or N.");
            }

            // Ask if the user wishes to continue processing input
            System.out.print("Enter data for a new student? (Y/N): ");
            userChoice = input.nextLine().toLowerCase();
        }
    }
}
