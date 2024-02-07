package JavaSE.TestArrayList;

import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;

public class TestArrayList17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet<Integer> hashSet = new HashSet<>();

        ArrayList<Integer> arrayList = new ArrayList<>();

        int check = 0;
        while (check == 0) {
            arrayList.add(in.nextInt());
            if (arrayList.contains(0)) {
                check++;
                break;
            }
        }
        for (Integer element: arrayList) {
            hashSet.add(element);
        }
        hashSet.remove(0);
        System.out.println(hashSet);
    }
}
