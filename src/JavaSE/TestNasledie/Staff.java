package JavaSE.TestNasledie;

public class Staff extends User {
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;
    }

    public Staff(double salary, String[] subjects, int indexOfSubject) {
        this.salary = salary;
        this.subjects = subjects;
        this.indexOfSubject = indexOfSubject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addSubject(String subject) {
        subjects[indexOfSubject] = subject;
        indexOfSubject++;
    }

    @Override
    public void getData() {
        System.out.print("ID: " + id + ". FULL NAME: " + name
                + " " + surname + ". LOGIN: " + login + ". PASSWORD: " + password + ".");
        System.out.println(" SALARY: " + salary);
        System.out.println("SUBJECTS:");
        for (int i = 0; i < indexOfSubject; i++) {
            System.out.println(subjects[i]);
        }
    }
}
