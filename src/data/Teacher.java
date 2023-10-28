package data;

public class Teacher extends User {

    private int teacherId;

    //  private int srBall;

    public Teacher(String firstname, String secondname, String lastname, int teacherId) {
        super(firstname, secondname, lastname);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstname='" + super.getFirstname() + '\'' +
                ", secondname='" + super.getSecondname() + '\'' +
                ", lastname='" + super.getLastname() + '\'' +
                ", teacherId=" + teacherId +
                '}';
    }

}


//    public int getStudentId() {
//        return studentId;
//    }
//
//    public void setStudentId(int studentId) {
//        this.studentId = studentId;
//    }
//
//    public int getSrBall() {
//        return srBall;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "firstname='" + super.getFirstname() + '\'' +
//                ", secondname='" + super.getSecondname() + '\'' +
//                ", lastname='" + super.getLastname() + '\'' +
//                ", studentId=" + studentId +
//                ", srBall=" + srBall +
//                '}';
//    }
//
//
//    @Override
//    public int compareTo(Student o) {
//        if(this.srBall == o.getSrBall())
//            return 0;
//        if(this.srBall > o.srBall)
//            return 1;
//        return - 1;
//    }

//}
