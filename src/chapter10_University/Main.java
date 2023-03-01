package chapter10_University;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (true) {

            User[] users = new User[3];

            System.out.println("PRESS [1] ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");
            int push1 = in.nextInt();

            if (push1 == 1) {
                System.out.println("  PRESS [1] TO ADD STUDENT");
                System.out.println("  PRESS [2] TO ADD STAFF");
                int push2 = in.nextInt();

                if (push2 == 1) {
                    Student stud1 = new Student(3, in.next(), in.next(), in.next(), in.next(), in.nextDouble());
                    stud1.addCourse(in.next());
                } else if (push2 == 2) {
                    Staff staff1 = new Staff(2, in.next(), in.next(), in.next(), in.next(), in.nextInt());
                    staff1.addSubject(in.next());
                }
//            } else if (push1 == 2) {
//                System.out.println("  PRESS [1] TO LIST STUDENTS");
//                System.out.println("  PRESS [2] TO LIST STAFF");
//                int push2 = in.nextInt();
//
//                if (push2 == 1) {
//                    Student.getData();
//                } else if (push2 == 2) {
//                    Staff.getData();
//                }
            }else if(push1 == 0) {
                break;
            }
        }
    }
}

//            User u1 = new User(1,in.next(),in.next(),in.next(),in.next());
//        }
//



//
//
//        for (int i = 0; i < users.length; i++) {
//            users[i].getData();
//        }

//        User [] users = new User[3];
//
//        while (true){
//            System.out.println("PRESS [1] ADD USER");
//            System.out.println("PRESS [2] TO LIST USERS");
//            System.out.println("PRESS [0] TO EXIT");
//
//            int push1 = in.nextInt();
//            if(push1 == 1){
//                System.out.println("  PRESS [1] TO ADD STUDENT");
//                System.out.println("  PRESS [2] TO ADD STAFF");
//                int push2 = in.nextInt();
//                if(push2 == 1){
//                    for (int i = 0; i < users.length; i++) {
//                        users[i] = new Student();
//                        users[i].id = in.nextInt();
//                        users[i].login = in.next();
//                        users[i].password = in.next();
//                        users[i].name = in.next();
//                        users[i].surname = in.next();
//                        users[i].setGpa = in.nextDouble();
//                        users[i].set = in.next();
//                    }
//                }else if(push2 == 2){
//                    for (int i = 0; i < users.length; i++) {
//                        users[i].id = in.nextInt();
//                        users[i].login = in.next();
//                        users[i].password = in.next();
//                        users[i].name = in.next();
//                        users[i].surname = in.next();
//                    }
//                }
//
//            for (int i = 0; i < users.length; i++) {
//                User u1 = new User(1,in.next(),in.next(),in.next(),in.next());
//                users[i].getData();
//            }
//
//
//
//        Staff staff1 = new Staff(2,in.next(),in.next(),in.next(),in.next(), in.nextInt());
//        staff1.addSubject(in.next());
//        Student stud1 = new Student(3,in.next(),in.next(),in.next(),in.next(),in.nextDouble());
//        stud1.addCourse(in.next());
//
//
//
//
//
////
////
////
////                }
////            }
////        }
//
//
////
////
////        System.out.println("PRESS [1] ADD USER");
////        System.out.println("PRESS [2] TO LIST USERS");
////        System.out.println("PRESS [0] TO EXIT");
////
////        int push1 = in.nextInt();
//////        Student stud1 = new Student();
//////        Staff staff1 = new Staff();
////        User user1 = new User();
//////        User []users = {stud1,staff1,user1};
////
////        if (push1 == 1) {
////            System.out.println("  PRESS [1] TO ADD STUDENT");
////            System.out.println("  PRESS [2] TO ADD STAFF");
////            int push2 = in.nextInt();
////            if (push2 == 1) {
////                Student stud1 = new Student(3, in.next(), in.next(), in.next(), in.next(), in.nextDouble());
////                stud1.addCourse(in.next());
////            } else if (push2 == 2) {
////                Staff staff1 = new Staff(2, in.next(), in.next(), in.next(), in.next(), in.nextInt());
////                staff1.addSubject(in.next());
////            }
////        } else if (push1 == 2) {
////            System.out.println("  PRESS [1] TO LIST STUDENTS");
////            System.out.println("  PRESS [2] TO LIST STAFF");
////            int push2 = in.nextInt();
////            if (push2 == 1) {
////                Student stud1 = new Student();
////                stud1.getData();
////            } else if (push2 == 2) {
////                Staff staff1 = new Staff();
////                staff1.getData();
////            }
//////        } else if (push1 == 0) {
//////            ;
//////        }
////
//
////
////        }
//    }
//}
