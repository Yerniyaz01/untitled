package JavaSE.TestArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class TestArrayList19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();

        int check = 0;
        while (check == 0) {
            set.add(in.nextInt());
            if (set.contains(0)) {
                break;
            }
        }
        set.remove(0);

        int res = in.nextInt();
        if (set.contains(res)) {
            System.out.println("Number " + res + " included in the set.");
        } else {
            System.out.println("Number " + res + " not included in the set.");
        }

    }
}
