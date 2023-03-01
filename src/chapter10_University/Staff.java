package chapter10_University;

public class Staff extends User{
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff(){
        super();
        this.salary = 0.0;
    }
    public Staff(int id,String login,String password,String name,String surname,double salary){
        super( id, login, password, name, surname);
        this.salary = salary;
        this.indexOfSubject = 0;
    }
    public Staff(int id,String login,String password,String name,String surname,int salary){
        super( id, login, password, name, surname);
        this.salary = salary;
        this.indexOfSubject = 0;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String[] getSubjects() {
        return subjects;
    }
    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
    public int getIndexOfSubject() {
        return indexOfSubject;
    }
    public void setIndexOfSubject(int indexOfSubject) {
        this.indexOfSubject = indexOfSubject;
    }

    public void addSubject(String subject){
        subjects[indexOfSubject++] = subject;
    }


    public void getData(){
        System.out.println("ID: "+id+" FULL NAME: "+name+" "+surname+" LOGIN: "+login+" PASSWORD: "+password+" SALARY: "+salary+"\n"+"SUBJECTS:");

        for (int i = 0; i < indexOfSubject; i++) {
            System.out.println(subjects[i]);
        }
    }
}
