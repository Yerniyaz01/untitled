package JavaSE.TestArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = in.nextInt();
        int max = Integer.MIN_VALUE;
        int a = 0;

        for (int i = 0; i < size; i++) {
            arrayList.add(in.nextInt());
            if (max < arrayList.get(i)) {
                max = arrayList.get(i);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)==max) {
                a = i;
            }
        }
        arrayList.remove(a);
        max = Integer.MIN_VALUE;

        for (int i = 0; i < arrayList.size(); i++) {
            if (max < arrayList.get(i)) {
                max = arrayList.get(i);
            }
        }
        System.out.println(max);

    }
}
