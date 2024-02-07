package JavaSE.TestArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class TestArrayList15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet<String> hashSet = new HashSet<>();

        int check = 0;
        int res = 0;
        while (check == 0) {
            hashSet.add(in.next());
            if (hashSet.contains("stop")) {
                break;
            }
        }
        hashSet.remove("stop");
        for (String element : hashSet) {
            res = res + element.length();
        }
        System.out.println(res);
    }
}
