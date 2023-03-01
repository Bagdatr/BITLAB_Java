package MyWork_Student;

public class Student {
    int id;
    String name;
    String surname;
    double gpa;

    public Student(int id, String name, String surname, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }
    public Student(){
    }

    public String getStudentData(){
        return "ID: "+id+" Full Name: "+name+" "+surname+" GPA: "+gpa;
    }

}
