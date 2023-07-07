package association.manytomany;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<Student> enrollStudent;

    public Course(String name) {
        this.name = name;
        this.enrollStudent = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.enrollStudent.add(student);
    }

    public void enrollStudent(Course pbo) {
    }
}
