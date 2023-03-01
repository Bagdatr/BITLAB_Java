package chapter12_Interface2;

public class HRManagers implements Workers{
    int id;
    String fullName;
    int salary;

    public HRManagers(){
        this.id = 0;
        this.fullName = "No name";
        this.salary = 0;
    }
    public HRManagers(int id, String fullName, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getWorkerData(){
        return "ID: "+id+" FULL NAME: "+fullName;
    }
}
