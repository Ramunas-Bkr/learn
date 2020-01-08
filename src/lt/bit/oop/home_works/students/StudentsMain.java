package lt.bit.oop.home_works.students;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Pašalinti studentus, kurie praleido 20% paskaitų.
 */

class StudentsMain {

    private static final int REQUIRED_ATTENDANCE = 80; // lankomumas procentais
    private static final int LESSONS = 20; // is viso paskaitu

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Rokas", 16));
        students.add(new Student("Vaidas", 12));
        students.add(new Student("Arturas", 17));
        students.add(new Student("Ramunas", 20));
        students.add(new Student("Margarita", 0));

        int needLessons = LESSONS * REQUIRED_ATTENDANCE / 100;

        for (Student x: students) {
            if (x.getLessonsAttended() < needLessons) {
                System.out.println("Pašalintas studentas: " + x);
            }
         }

        Iterator <Student> itr = students.iterator();
        while (itr.hasNext()) {
            Student stud = itr.next();
            if (stud.getLessonsAttended() < needLessons) {
                itr.remove();
            }

                   }
        System.out.println("Likusių studentų sąrašas: " + students);

        }
}