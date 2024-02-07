package JavaSE.TestClass;

public class Student {
    int id;
    String name;
    String surname;
    double gpa;

    public Student() {
    }

    public Student(int id,String name,String surname,double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getStudentData() {
        String get = "ID: " + id + ", Full Name: " + name + " " + surname + ", GPA: " + gpa;
        return get;
    }
}

//Продолжайте работать над предыдущим классом Student.
//Создайте метод String getStudentData(). Данный метод возвращает все данные студента.
//Например, если id = 1, name = "Ilyas", surname = "Zhuanyshev", gpa = 3.4, то тогда возвращаемый текст будет:
//"ID: 1, Full Name: Ilyas Zhuanyshev, GPA: 3.4"