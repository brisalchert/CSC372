package Module6;

public class Student {
    int rollno;
    String name;
    String address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return "Roll No: " + this.rollno + ", Name: " + this.name + ", Address: " + this.address;
    }
}
