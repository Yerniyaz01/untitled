package JavaSE.TestStreamApi2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStreamApi1 {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            arrayList.add(in.nextInt());
        }
        arrayList.stream().filter(s-> s%2==0).forEach(s-> System.out.print(s+" "));

    }
}
