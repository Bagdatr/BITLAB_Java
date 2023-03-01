package chapter12;

public interface UserBean {
    abstract void getAllUsers();
    abstract void getUsersByName(String name);
    abstract void getUsersBySurname(String surname);

}
