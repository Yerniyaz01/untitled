package JavaSE.TestMap;

import java.util.HashMap;
import java.util.Scanner;

public class TestMap5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        char[] symbol = str.toCharArray();
        HashMap <Character, Integer> hashMap = new HashMap<>();

        for (Character element: symbol) {
            if (hashMap.containsKey(element)) {
                int check = hashMap.get(element);
                check++;
                hashMap.put(element,check);
            } else {
                hashMap.put(element,1);
            }
        }

        for (Character element: hashMap.keySet()) {
            System.out.println("'" + element + "' occurs " + hashMap.get(element) + " times");
        }

    }
}
