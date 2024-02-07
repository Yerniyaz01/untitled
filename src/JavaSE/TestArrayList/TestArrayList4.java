package JavaSE.TestArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = in.nextInt();
        int a = 0;

        for (int i = 0; i < size; i++) {
            arrayList.add(in.nextInt());
            if (arrayList.get(i)>0) {
                a++;
            }
        }
        System.out.println(a);

    }
}
