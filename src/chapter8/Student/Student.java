package chapter8.Student;

public class Student {
    int id;
    String name;
    String surname;
    double gpa;

//    public Student(){
//        this.id = 0;
//        this.name = "No name";
//        this.surname = "No name";
//        this.gpa = 0.0;
//    }
    public Student(int id,String name, String surname,double gpa){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }
    public String getStudentData(){
        return id+") "+name+" "+surname+" "+gpa;
    }



}
