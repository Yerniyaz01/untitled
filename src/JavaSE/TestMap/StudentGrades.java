package JavaSE.TestMap;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    private Map<String, Integer> grades = new HashMap<>();

    void addStudent(String name, int grade) {
        grades.put(name,grade);
    }

    void printStudentsAboveGrade(int threshold) {
        for (String element: grades.keySet()) {
            if (grades.get(element)>threshold) {
                System.out.println(element + ": " + grades.get(element));
            }
        }
    }
}
