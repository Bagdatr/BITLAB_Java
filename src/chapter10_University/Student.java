package chapter10_University;
public class Student extends User {
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    public Student() {
        super();
        this.gpa = 0.0;
        this.indexOfCourses = 0;
    }
    public Student(int id, String login, String password, String name, String surname, double gpa, int indexOfCourses) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
        this.indexOfCourses = indexOfCourses;
    }
    public Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String[] getCourses() {
        return courses;
    }
    public void setCourses(String[] courses) {
        this.courses = courses;
    }
    public int getIndexOfCourses() {
        return indexOfCourses;
    }
    public void setIndexOfCourses(int indexOfCourses) {
        this.indexOfCourses = indexOfCourses;
    }

    public void addCourse(String course){
        courses [indexOfCourses++] = course;
    }
    public void getData() {
        System.out.println("ID: " + id + " FULL NAME: " + name + " " + surname + " LOGIN: " + login + " PASSWORD: " + password + " GPA: " + gpa /*+ "\n" + "COURSES:"*/);

        for (int i = 0; i < indexOfCourses; i++) {
            System.out.println(courses[i]);
        }
    }
}
