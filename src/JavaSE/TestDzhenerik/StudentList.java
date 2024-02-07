package JavaSE.TestDzhenerik;

import java.util.ArrayList;
import java.util.List;

public class StudentList<T extends Student> {
    T t;
    private List<T> students = new ArrayList<>();

    public StudentList() {
    }

    public StudentList(List<T> students) {
        this.students = students;
    }

    public List<T> getStudents() {
        return students;
    }

    public void setStudents(List<T> students) {
        this.students = students;
    }

    public void addStudent(T student) {
        students.add(student);
    }

    public void removeStudent(T student) {
        students.remove(student);
    }

    public T getHighestGpaStudent() {
        double max = Double.MIN_VALUE;
        T t = null;
        int a = 0;
        for (T student : students) {
            if (max < student.getGpa()) {
                max = student.getGpa();
                t = students.get(a);
            }
            a++;
        }
        return t;
    }

    public void sortByLastName() {
        for (int i = 0; i < students.size(); i++) {
            for (int j = i+1; j < students.size(); j++) {
                T student1 = students.get(i);
                T student2 = students.get(j);
                if (student1.getLastName().compareTo(student2.getLastName())>0) {
                    students.set(i, student2);
                    students.set(j, student1);
                }
            }
        }
    }

    public void swap(int index1, int index2) {
        T student1 = students.get(index1);
        T student2 = students.get(index2);
        students.set(index1, student2);
        students.set(index2, student1);
    }
}

