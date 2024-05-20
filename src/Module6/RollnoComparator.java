package Module6;

import java.util.Comparator;

public class RollnoComparator implements Comparator<Student> {
    /**
     * Compares the rollno of two student objects
     * @param student1 the first Student to be compared.
     * @param student2 the second Student to be compared.
     * @return a positive value if the rollno of the first student is higher, 0 if they are equal, and a negative
     * value if the rollno of the second student is higher
     */
    @Override
    public int compare(Student student1, Student student2) {
        return student1.rollno - student2.rollno;
    }
}
