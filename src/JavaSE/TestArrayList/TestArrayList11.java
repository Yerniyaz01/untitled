package JavaSE.TestArrayList;

import java.util.Scanner;
import java.util.HashSet;

public class TestArrayList11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            hashSet.add(in.next());
        }

        System.out.println(hashSet.size());
    }
}
