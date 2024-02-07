package JavaSE.TestArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = 0;
        arrayList.add(in.nextInt());
        while(arrayList.get(size)!=0) {
            arrayList.add(in.nextInt());
            size++;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)<0) {
                System.out.print(arrayList.get(i) + " ");
                if (max < arrayList.get(i)){
                    max = arrayList.get(i);
                }
            }
        }
        System.out.println();
        System.out.println(max);

    }
}
