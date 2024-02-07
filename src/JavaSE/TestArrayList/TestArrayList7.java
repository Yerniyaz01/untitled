package JavaSE.TestArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = 0;
        arrayList.add(in.nextInt());
        while (arrayList.get(size)!=0) {
            arrayList.add(in.nextInt());
            size++;
        }

        int flag = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(i) == arrayList.get(j)) {
                    flag++;
                }
            }
            if (flag>=2) {
                System.out.print(arrayList.get(i) + " ");
            }
            flag = 0;
            arrayList.remove(i);
        }

    }
}
