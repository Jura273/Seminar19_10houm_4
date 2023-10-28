package service;

import data.Teacher;
import data.TeacherGroup;
import data.UserComaporator;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TeacherGroupService {
    private TeacherGroup teacherGroup;
    public void createGroup(List<Teacher> teacherList)
    {
        teacherGroup = new TeacherGroup(teacherList);
    }
    public TeacherGroup getTeacherGroup() {
        return teacherGroup;
    }

    public  Teacher createTeacher(String firstname, String secondname, String lastname){
        if (teacherGroup == null)
            createGroup((new ArrayList<>()));
        int maxid = 0;
        for(Teacher teacher : teacherGroup.getTeacherList())
            if (teacher.getTeacherId() > maxid)
                maxid = teacher.getTeacherId();
        return new Teacher(firstname, secondname, lastname, ++maxid);
    }

    //    public List<Student> getSortedStudentGroupBySRBall(){
//        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
//        Collections.sort(studentList);
//        return studentList;
//    }
    public List<Teacher> getListTeacher(){

        return teacherGroup.getTeacherList();
    }

    public List<Teacher> getSortedTeacherGroupByFIO(){
        List<Teacher> studentList = new ArrayList<>(teacherGroup.getTeacherList());
        studentList.sort(new UserComaporator());
        return studentList;
    }

//    public void printStudentGroup(){
//        for (Student st: studentGroup) {
//            System.out.println(st);
//        }
//    }
}
