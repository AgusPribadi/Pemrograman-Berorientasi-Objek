package association.manytomany;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> coursesEnrolled;

    public Student(String name) {
        this.name = name;
        this.coursesEnrolled = new ArrayList<>();

    }

    public void enroll(Course course) {
        this.coursesEnrolled.add(course);
    }

    public void coursesEnrolled(Student zuhrie) {
    }
}
