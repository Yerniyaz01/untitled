package JavaSE.TestArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = 0;
        arrayList.add(in.nextInt());
        while (arrayList.get(size) != 0) {
            arrayList.add(in.nextInt());
            size++;
        }
        arrayList.remove(size);
        for (int i = 0; i < arrayList.size(); i++) {
            int number = arrayList.get(i);
            int count = 0;
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && number != 1) {
                System.out.print(number + " ");
            }
        }
    }
}
