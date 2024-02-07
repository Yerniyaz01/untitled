package JavaSE.TestArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();

        int size = in.nextInt();

        for (int i = 0; i < size; i++) {
            arrayList.add(in.nextInt());
        }

        for (Integer element: arrayList) {
            System.out.print((element/2) + " ");
        }

    }
}
