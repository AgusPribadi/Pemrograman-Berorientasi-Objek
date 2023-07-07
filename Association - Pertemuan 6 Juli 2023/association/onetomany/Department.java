package association.onetomany;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Lecturer> lecturers;

    public Department(String name) {
        this.name = name;
        this.lecturers = new ArrayList<>();
    }
    public void addLecturers(Lecturer lecturer) {
        this.lecturers.add(lecturer);
    }
}
