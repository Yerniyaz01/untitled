package JavaSE.TestLambda;

import java.util.ArrayList;

public class StudentAwards {

    public Student theMostGPA(ArrayList<Student> students) {
        BestStudent mostGPA = (students1) -> {
            double max = Double.MIN_VALUE;
            int index = 0;

            for (int i = 0; i < students1.size(); i++) {
                if (max < students1.get(i).getGpa()) {
                    max = students1.get(i).getGpa();
                    index = i;
                }
            }
            return students1.get(index);
        };
        return mostGPA.theBest(students);
    }

    public Student theMostAge(ArrayList<Student> students) {
        BestStudent mostMostAge = (students1) -> {
            int max = Integer.MIN_VALUE;
            int index = 0;

            for (int i = 0; i < students1.size(); i++) {
                if (max < students1.get(i).getAge()) {
                    max = students1.get(i).getAge();
                    index = i;
                }
            }
            return students1.get(index);
        };
        return mostMostAge.theBest(students);
    }

    public Student theLongestFullName(ArrayList<Student> students) {
        BestStudent theLongestFullName = (students1) -> {
            int max = Integer.MIN_VALUE;
            int index = 0;
            for (int i = 0; i < students1.size(); i++) {
                if (max < students1.get(i).getFullName().length()) {
                    max = students1.get(i).getFullName().length();
                    index = i;
                }
            }
            return students1.get(index);
        };
        return theLongestFullName.theBest(students);
    }

    public Student theHighest(ArrayList<Student> students) {
        BestStudent theHighest = (students1) -> {
            int max = Integer.MIN_VALUE;
            int index = 0;

            for (int i = 0; i < students1.size(); i++) {
                if (max < students1.get(i).getHeight()) {
                    max = students1.get(i).getHeight();
                    index = i;
                }
            }
            return students1.get(index);
        };
        return theHighest.theBest(students);
    }


}
