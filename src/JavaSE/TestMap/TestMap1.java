package JavaSE.TestMap;

import java.util.HashMap;
import java.util.Scanner;

public class TestMap1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            hashMap.put(in.next(), in.nextInt());
        }
        for (String element : hashMap.keySet()) {
            System.out.println(element + " cost " + hashMap.get(element) + " USD");
        }

    }
}
