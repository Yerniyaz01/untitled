package JavaSE.TestStreamApi2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStreamApi4 {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            arrayList.add(in.nextInt());
        }
        int max = arrayList.stream().reduce(0, Integer::max);

        System.out.println(max);

    }
}
