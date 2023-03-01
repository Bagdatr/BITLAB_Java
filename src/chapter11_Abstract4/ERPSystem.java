package chapter11_Abstract4;

public class ERPSystem {
    User []memory = new User[1000];
    int sizeOfUsers = 0;

    public void addUser(User u) {
        memory[sizeOfUsers] = u;
        sizeOfUsers++;
    }
    public void printTeacher(){
        for (int i = 0; i < sizeOfUsers; i++) {
            if(memory[i] instanceof Teacher){
                System.out.println(memory[i].getUserData());
            }
        }
    }
    public void printStudent(){
        for (int i = 0; i < sizeOfUsers; i++) {
            if(memory[i] instanceof Student){
                System.out.println(memory[i].getUserData());
            }
        }
    }
    public void printUser(int index){
        for (int i = 0; i < sizeOfUsers; i++) {
            if(i == index-1){
                System.out.println(memory[i].getUserData());
                return;
            }
        }
        System.out.println("No such user in this index");
    }
}
