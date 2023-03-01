package chapter12;

public class UserBeanImp implements UserBean{
    Users[] users;

    public UserBeanImp(Users[] users) {
        this.users = users;
    }

    public Users[] getUsers() {
        return users;
    }
    public void setUsers(Users[] users) {
        this.users = users;
    }

    public void getAllUsers(){
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].name+" "+users[i].surname);
        }
    }
    public void getUsersByName(String name) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].name.contains(name)) {
                System.out.println(users[i].name + " " + users[i].surname);
            }
        }
    }
    public void getUsersBySurname(String surname){
        for (int i = 0; i < users.length; i++) {
            if (users[i].surname.contains(surname)) {
                System.out.println(users[i].name + " " + users[i].surname);
            }
        }
    }
}
