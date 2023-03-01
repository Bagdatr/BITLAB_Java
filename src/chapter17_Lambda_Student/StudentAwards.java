package chapter17_Lambda_Student;

import java.util.ArrayList;

public class StudentAwards {
    public Student theMostGPA(ArrayList<Student> students) {
        BestStudent best = studentList -> {
            Student maxGpaStudent = studentList.get(0);
            for (Student st : studentList) {
                if (maxGpaStudent.getGpa() < st.getGpa()) {
                    maxGpaStudent = st;
                }
            }
            return maxGpaStudent;
        };
        return best.theBest(students);
    }


    public Student theMostAge(ArrayList<Student> students) {
        BestStudent best = studentList -> {
            Student maxStudentAge = studentList.get(0);
            for (Student st : studentList) {
                if (maxStudentAge.getAge() < st.getAge()) {
                    maxStudentAge = st;
                }
            }
            return maxStudentAge;
        };
        return best.theBest(students);
    }

    public Student theLongFullName(ArrayList<Student> students) {
        BestStudent best = studentList -> {
            Student maxFullName = studentList.get(0);
            for (Student st : studentList) {
                if (maxFullName.getFullName().length() < st.getFullName().length()) {
                    maxFullName = st;
                }
            }
            return maxFullName;
        };
        return best.theBest(students);
    }

    public Student theHighest(ArrayList<Student> students) {
        BestStudent best = studentList -> {
            Student maxHeight = studentList.get(0);
            for (Student st : studentList) {
                if (maxHeight.getHeight() < st.getHeight()) {
                    maxHeight = st;
                }
            }
            return maxHeight;
        };
        return best.theBest(students);
    }
}
