package JavaSE.TestArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class TestArrayList13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet<Integer> hashSet = new HashSet<>();

        int check = 0;
        int res = 0;
        while (check == 0) {
            hashSet.add(in.nextInt());
            if (hashSet.contains(0)) {
                check++;
                break;
            }
        }
        for (Integer element: hashSet) {
            res = res + element;
        }
        System.out.println(res);

    }
}
