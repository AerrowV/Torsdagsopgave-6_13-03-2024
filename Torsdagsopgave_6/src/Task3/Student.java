package Task3;

import java.util.ArrayList;

public class Student extends Person {

    ArrayList<String> passedCourses;
    ArrayList<String> currentCourses;

    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = new ArrayList<>();

    }

    @Override
    public boolean addCourse(String course) {
        for (String passedCourse : passedCourses) {
            if (passedCourse.equals(course)) {
                return false;
            }
        }
        for (String currentCourse : currentCourses) {
            if (currentCourse.equals(course)) {
                return false;
            }
        }
        currentCourses.add(course);
        return true;
    }
}
