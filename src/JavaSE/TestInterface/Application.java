package JavaSE.TestInterface;

public class Application implements EmployeeInterface{
    Employee[] employees = new Employee[1000];
    int count = 0;

    @Override
    public void addEmployee(Employee e) {
        employees[count] = e;
        count++;
    }

    @Override
    public void deleteEmployee(int index) {
        employees[index] = null;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < count; i++) {
            if (employees[i]!=null) {
                System.out.println(employees[i]);
            }
        }
    }

    @Override
    public Employee search(String fullName) {
        int a = 0;
        for (int i = 0; i < count; i++) {
            if (employees[i].getFullName() == fullName) {
                a = i;
            }
        }
        return employees[a];
    }

    @Override
    public Employee oldestEmployee() {
        int maxAge = Integer.MIN_VALUE;
        int a = 0;
        for (int i = 0; i < count; i++) {
            if (employees[i].getAge() > maxAge) {
                maxAge = employees[i].getAge();
                a = i;
            }
        }
        return employees[a];
    }

    @Override
    public Employee smallestEmployee() {
        int minAge = Integer.MAX_VALUE;
        int a = 0;
        for (int i = 0; i < count; i++) {
            if (employees[i].getAge() < minAge) {
                minAge = employees[i].getAge();
                a = i;
            }
        }
        return employees[a];
    }
}
