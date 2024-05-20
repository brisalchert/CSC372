package Module6;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    /**
     * Compares the name attributes of two Student objects
     * @param student1 the first object to be compared
     * @param student2 the second object to be compared
     * @return a positive value if the name of the first student comes first alphabetically, 0 if they are equal,
     * or a negative value if the name of the second student comes first alphabetically
     */
    @Override
    public int compare(Student student1, Student student2) {
        return student1.name.compareTo(student2.name);
    }
}
