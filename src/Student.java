import java.util.*;

public class Student {
    private String name;
    private String group;
    private int course;
    private LinkedList<Integer> marks;

    public Student(String name, String group, int course, LinkedList<Integer> marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }


    public double getAverageScore(LinkedList<Integer> marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        if (marks.size() == 0) {
            return 0;
        }
        return (double) sum/ marks.size();
    }

    public void promoteToNextCourse() {
        this.course ++;
    }

    public static void checkStudentsMarks(List<Student> students) {
        for (int i = students.size()-1; i >= 0; i--) {
            Student student = students.get(i);
            if (student.getAverageScore(student.marks) < 3) {
                students.remove(i);
            }
            else {
                student.promoteToNextCourse();
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students in tne " + course + " course: ");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }

    }

    private String getName() {
        return this.name;
    }

    private int getCourse() {
        return this.course;
    }


}
