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
    }
}
