package JavaSE.TestNasledie;

public class Student extends User{
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourse = 0;

    public Student() {
    }

    public Student(int id, String name, String surname, String login, String password, double gpa) {
        super(id, name, surname, login, password);
        this.gpa = gpa;
    }

    public Student(double gpa, String[] courses, int indexOfCourse) {
        this.gpa = gpa;
        this.courses = courses;
        this.indexOfCourse = indexOfCourse;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void addCourses (String course) {
        courses[indexOfCourse] = course;
        indexOfCourse++;
    }

    public void getData() {
        System.out.print("ID: " + id + ". FULL NAME: " + name
                + " " + surname + ". LOGIN: " + login + ". PASSWORD: " + password + ". GPA: " + gpa);
        System.out.println("COURSES:");
        for (int i = 0; i < indexOfCourse; i++) {
            System.out.println(courses[i]);
        }
    }
}
