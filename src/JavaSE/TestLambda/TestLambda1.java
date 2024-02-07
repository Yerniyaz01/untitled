package JavaSE.TestLambda;

import java.util.*;

public class TestLambda1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> arrayList = new ArrayList<>();

        int size = 0;
        while (size == 0) {
            arrayList.add(in.next());
            if (arrayList.contains("exit")) {
                break;
            }
        }

        arrayList.remove("exit");
        arrayList.sort(Comparator.comparing(String::length));

        System.out.println(arrayList);
    }
}
