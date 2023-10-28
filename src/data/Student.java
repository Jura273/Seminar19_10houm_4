package data;

public class Student extends User implements Comparable<Student> {

    private int studentId;

    private int srBall;

    public Student(String firstname, String secondname, String lastname, int studentId, int srBall) {
        super(firstname, secondname, lastname);
        this.studentId = studentId;
        this.srBall = srBall;
    }





    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getSrBall() {
        return srBall;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + super.getFirstname() + '\'' +
                ", secondname='" + super.getSecondname() + '\'' +
                ", lastname='" + super.getLastname() + '\'' +
                ", studentId=" + studentId +
                ", srBall=" + srBall +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        if(this.srBall == o.getSrBall())
            return 0;
        if(this.srBall > o.srBall)
            return 1;
        return - 1;
    }
}

