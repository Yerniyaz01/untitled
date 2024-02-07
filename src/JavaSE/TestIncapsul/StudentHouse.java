package JavaSE.TestIncapsul;

public class StudentHouse {
    String name;
    Student[] students= new Student[1000];
    int size = 0;

    public StudentHouse() {
    }

    public StudentHouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students[size]=student;
        size++;
    }

    public void deleteStudent(int i){
        students[i]=null;
    }

    public void printStudents(){
        for (int i = 0; i < size; i++) {
            if (students[i]!=null) {
                System.out.println(students[i]);
            }
        }
    }

    public Student theBestStudent() {
        double max = 0;
        int a = 0;
        for (int i = 0; i < size; i++) {
            if (students[i].getGpa()>max) {
                max = students[i].getGpa();
                a = i;
            }
        }
        return students[a];
    }

}
