package chapter11_Abstract4;

public class Teacher extends User {
    String nickName;
    String status; //// например: Professor, Lecturer, Tutor, Assistant.
    String subjects[] = new String[10]; //// Предметы которые он ведет, максимум 10
    int sizeOfSubjects = 0;

    public Teacher() {
        super();
        this.nickName = "No nickname";
        this.status = "No status";
    }

    public Teacher(int id, String login, String password, String nickName, String status) {
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }

    public void addSubject(String subject) {
        subjects[sizeOfSubjects++] = subject;
    }

    public String getUserData() {
        return "ID: " + id + " LOGIN: " + login + " PASSWORD: " + password + " NICKNAME: " + nickName + " STATUS: " + status;
    }
}
