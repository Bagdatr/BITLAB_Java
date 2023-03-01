//package chapter8.Student;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Student[] students = new Student[3];
//        while (true) {
//            System.out.println("PRESS [1] TO ADD STUDENT");
//            System.out.println("PRESS [2] TO LIST STUDENT");
//            System.out.println("PRESS [0] TO EXIT");
//
//            int addStud = in.nextInt();
//            if (addStud == 1) {
//                for (int i = 0; i < students.length; i++) {
//                    students[i] = new Student();
//                    students[i].id = in.nextInt();
//                    students[i].name = in.next();
//                    students[i].surname = in.next();
//                    students[i].gpa = in.nextDouble();
//                }
//            } else if (addStud == 2)
//                for (int i = 0; i < students.length; i++) {
//                    System.out.println(students[i].getStudentData());
//                }
//            else if (addStud == 0) {
//                break;
//            }
//        }
//
//        public Student topStudent(Student students[]){
//            Student max = students[0];
//            for (int i = 0; i < students.length; i++) {
//                if(max.gpa<students[i].gpa){
//                    max = students[i];
//                }
//            }
//            return max;
//        }
////        static Student topStudent (Student, students[]){
////            double gpaMax = students[0].gpa;
////            int studIndex = 0;
////            for (int i = 0; i < students.length; i++) {
////                if (gpaMax < students[i].gpa) {
////                    gpaMax = students[i].gpa;
////                    studIndex++;
////                }
////            }
////            System.out.println(students[studIndex]);
////        }
//
////        String name1 = in.next();
////        String model1 = in.next();
////        int price1 = in.nextInt();
////        Phone p1 = new Phone(name1, model1, price1);
////
////        String name2 = in.next();
////        String model2 = in.next();
////        int price2 = in.nextInt();
////        Phone p2 = new Phone(name2, model2, price2);
////
////        String name3 = in.next();
////        String model3 = in.next();
////        int price3 = in.nextInt();
////        Phone p3 = new Phone(name3, model3, price3);
//
////        System.out.println(p1.getData());
////        System.out.println(p2.getData());
////        System.out.println(p3.getData());
//
//
//    }
//}