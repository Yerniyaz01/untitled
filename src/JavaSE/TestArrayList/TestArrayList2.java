package JavaSE.TestArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = in.nextInt();

        for (int i = 0; i < size; i++) {
            arrayList.add(in.nextInt());
        }

        float a = 0;
        for (Integer element: arrayList) {
            a = a + element;
        }
        System.out.println(a/size);
    }
}
