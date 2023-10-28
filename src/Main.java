import controler.StudentGroupControler;
import controler.TeacherGroupControler;
import data.Student;
import data.Teacher;

import java.util.List;

import static java.lang.Integer.parseInt;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StudentGroupControler controler = new StudentGroupControler();

        Student student1 = controler.create("5", "5", "5");
        Student student2 = controler.create("2", "2", "2");
        Student student3 = controler.create("3", "3", "3");
        System.out.println(student1.compareTo(student2));

        TeacherGroupControler controler1 = new TeacherGroupControler();
        Teacher teacher1 = controler1.create("55", "55", "55");
        Teacher teacher2 = controler1.create("22", "22", "22");
        Teacher teacher3 = controler1.create("33", "33", "33");
        List<Teacher> teacherList = List.of(new Teacher[]{teacher1, teacher2, teacher3});
        controler1.createTeacherGroup(teacherList);

        List<Student> studentList = List.of(new Student[]{student1, student2, student3});
        controler.createStudentGroup(studentList);
        controler.print();
        System.out.println("Сортировка...");
        controler.print(controler.sortedStudentGroupBySrBall());
        System.out.println("Сортировка(FIO) ...");
        controler.print(controler.sortedStudentGroupByFIO());
        System.out.println("Сортировка по (FIO) учителей ...");
        controler1.print(controler1.sortedTeacherGroupByFIO());
    }
}
