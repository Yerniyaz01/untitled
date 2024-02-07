package JavaSE.TestArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = in.nextInt();
        int l = in.nextInt();
        int r = in.nextInt();
        int res = 0;

        for (int i = 0; i < n; i++) {
            arrayList.add(in.nextInt());
        }
        for (int i = n-1; i >= 0; i--) {
            if (i>=l) {
                if (i<=r){
                    System.out.print(arrayList.get(i) + " ");
                }
            }
        }

    }
}
