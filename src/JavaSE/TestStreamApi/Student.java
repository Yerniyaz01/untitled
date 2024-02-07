package JavaSE.TestStreamApi;

import java.util.ArrayList;

public class Student {
    private String fullName;
    private double averageGrade;

    public Student() {
    }

    public Student(String fullName, double averageGrade) {
        this.fullName = fullName;
        this.averageGrade = averageGrade;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    static double getAverageGrade(ArrayList<Student> students){
        ArrayList<Double> students1 = new ArrayList<>();
        for (Student element: students) {
            students1.add(element.getAverageGrade());
        }
        double student = students1.stream().mapToDouble(Double::doubleValue).average().orElseThrow();
        return student;
    }
}
