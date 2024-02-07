package JavaSE.TestStreamApi;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStreamApi4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrayList.add(in.nextInt());
        }

        int max = arrayList.stream().mapToInt(Integer::intValue).max().orElseThrow();

        System.out.println(max);
    }
}
