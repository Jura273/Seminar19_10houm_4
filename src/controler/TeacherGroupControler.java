package controler;

import data.Teacher;
import service.TeacherGroupService;
import view.TeacherGroupView;

import java.util.List;

public class TeacherGroupControler implements UserControler<Teacher> {
    TeacherGroupService teacherGroupService = new TeacherGroupService();
    TeacherGroupView teacherGroupView = new TeacherGroupView();

    public void createTeacherGroup(List<Teacher> teacherList){

        teacherGroupService.createGroup(teacherList);
    }


    //    public List<Student> sortedStudentGroupBySrBall(){
//        return studentGroupService.getSortedStudentGroupBySRBall();
//    }
    public List<Teacher> sortedTeacherGroupByFIO()
    {
        return teacherGroupService.getSortedTeacherGroupByFIO();
    }



    public void print() {

        teacherGroupView.printTeacherGroup(teacherGroupService.getListTeacher());

    }
    public void print(List<Teacher> list)
    {
        teacherGroupView.printTeacherGroup(list);
    }

    @Override
    public Teacher create(String firstname, String secondname, String lastname) {
        return teacherGroupService.createTeacher(firstname, secondname, lastname);
    }
}

