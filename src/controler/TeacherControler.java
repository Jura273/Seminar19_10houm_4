package controler;

import data.Teacher;

public interface TeacherControler <T extends Teacher>{
    T create(String firstName, String secondName, String lastName);

}
