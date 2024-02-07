package JavaSE.TestArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestArrayList10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            arrayList.add(in.nextInt());
        }

        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            arrayList1.add(in.nextInt());
        }

        Collections.sort(arrayList);
        Collections.sort(arrayList1);

        System.out.println("Sorted first array:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
        System.out.println("Sorted second array:");
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.print(arrayList1.get(i) + " ");
        }
        System.out.println();

        for (Integer element: arrayList) {
            arrayList2.add(element);
        }
        for (Integer element: arrayList1) {
            arrayList2.add(element);
        }

        Collections.sort(arrayList2);

        System.out.println("Sorted third array:");
        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.print(arrayList2.get(i) + " ");
        }
    }
}
