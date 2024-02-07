package JavaSE.TestArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class TestArrayList12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet<Integer> hashSet = new HashSet<>();

        int res = 0;
        for (int i = 0; i < 5; i++) {
            hashSet.add(in.nextInt());
        }
        for (Integer element: hashSet) {
            res = res + element;
        }
        System.out.println(res);

    }
}
