package JavaSE.TestArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class TestArrayList18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        int check = 0;
        int res = 0;
        while (check == 0) {
            set1.add(in.next());
            if (set1.contains("exit")) {
                break;
            }
        }
        set1.remove("exit");
        while (check == 0) {
            set2.add(in.next());
            if (set2.contains("exit")) {
                break;
            }
        }
        set2.remove("exit");

        set1.addAll(set2);
        System.out.println(set1);
    }
}
