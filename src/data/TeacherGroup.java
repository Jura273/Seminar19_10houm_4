package data;

import data.Teacher;
import data.TeacherGroupIterator;

import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher> {
    private List<Teacher> teacherList;

    public TeacherGroup(List<Teacher> teacherList) {

        this.teacherList = teacherList;
    }

    public List<Teacher> getTeacherList() {

        return teacherList;
    }
    public void addGroup(Teacher teacher) {

        teacherList.add(teacher);
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(this);
    }
}
