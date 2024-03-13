package Task3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        // Student 1
        ArrayList<String> passedCoursesStudent1 = new ArrayList<>();
        passedCoursesStudent1.add("Java 1.0");
        persons.add(new Student("Asim", passedCoursesStudent1));

        // Student 2
        ArrayList<String> passedCoursesStudent2 = new ArrayList<>();
        persons.add(new Student("Johan", passedCoursesStudent2));

        // Student 3
        ArrayList<String> passedCoursesStudent3 = new ArrayList<>();
        passedCoursesStudent3.add("Java 1.0");
        persons.add(new Student("Lasse", passedCoursesStudent3));

        // Teacher 1
        ArrayList<String> canTeachTeacher1 = new ArrayList<>();
        persons.add(new Teacher("Tess", canTeachTeacher1));

        // Teacher 2
        ArrayList<String> canTeachTeacher2 = new ArrayList<>();
        canTeachTeacher2.add("Java 1.0");
        persons.add(new Teacher("Signe", canTeachTeacher2));


        for (int i = 0; i < persons.size(); i++) {
            boolean added = persons.get(i).addCourse("Java 1.0");
            if (!added) {
                Person person = persons.get(i);
                if (person instanceof Student) {
                    System.out.println(person.getName() + " har allerede bestået dette kursus.");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan ikke undervise i dette fag.");
                }
            }
            if (added) {
                Person person = persons.get(i);
                if (person instanceof Student) {
                    System.out.println(person.getName() + " kan godt tage dette kursus.");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan godt undervise i dette fag");
                }
            }
        }
    }
}
