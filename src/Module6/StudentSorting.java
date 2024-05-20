//----------------------------------------------------------------------------------------------------------------------
// Option #2: Storing an ArrayList II
//  Create a Java program that will store 10 student objects in an ArrayList, ArrayList<Student>. A student object
//  consists of the following fields:
//
//  - int rollno
//  - String name
//  - String address
//
//  Implement a comparator class to sort student objects by rollno (roll number). Implement your own merge sort method
//  and place your code in a separate Java source file. Do not use a sort method from the Java collections library.
//----------------------------------------------------------------------------------------------------------------------

package Module6;

import java.util.ArrayList;

public class StudentSorting {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        ArrayList<Student> students = new ArrayList<Student>();

        // Create fields for 10 Student objects
        int[] rollnoArray = {13, 7, 3, 65, 23, 87, 95, 32, 9, 42};
        String[] nameArray = {"Joe", "Emily", "Brian", "Max", "May",
                "Jessica", "George", "Harley", "Sean", "Samantha"};
        String[] AddressArray = {"14 Main Street",
                                 "67 East Street",
                                 "701 West Street",
                                 "52 North Avenue",
                                 "84 South Avenue",
                                 "403 North Avenue",
                                 "602 West Street",
                                 "845 East Street",
                                 "38 Main Street",
                                 "99 South Avenue"
        };

        // Create 10 new Student objects and add them to the ArrayList
        for (int index = 0; index < 10; index++) {
            students.add(new Student(rollnoArray[index], nameArray[index], AddressArray[index]));
        }

        // Print the initial list of Students:
        System.out.println("INITIAL LIST OF STUDENTS");
        System.out.println("------------------------------------------------------");

        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println();

        // Print the list of Students sorted by roll number
        mergeSort.mergeSort(students, new RollnoComparator());
        System.out.println("LIST OF STUDENTS SORTED BY ROLL NUMBER");
        System.out.println("------------------------------------------------------");

        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println();

        // Print the list of Students sorted by name
        mergeSort.mergeSort(students, new NameComparator());
        System.out.println("LIST OF STUDENTS SORTED BY NAME");
        System.out.println("------------------------------------------------------");

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
