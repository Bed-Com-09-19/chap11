import java.util.ArrayList;

public class Course {
    protected String courseName;
    protected ArrayList<String> Students = new ArrayList<>();
    protected int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        Students.add(student);
    }

    public String getStudents() {
        return Students.toString();
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        Students.remove(student);
    }
    
}