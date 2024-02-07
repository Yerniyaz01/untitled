package JavaSE.TestMap;

import java.util.HashMap;

public class University {
    private HashMap<String, Integer> studentList = new HashMap<>();

    public HashMap<String, Integer> getStudentList() {
        return studentList;
    }

    void addStudent(Student student){
        studentList.put(student.getName(), student.getGrade());
    }
}
