package JavaSE.TestMap;

import java.util.HashMap;
import java.util.Scanner;

public class TestMap4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String[] str1 = str.split(" ");
        HashMap <String, Integer> hashMap = new HashMap<>();

        for (String element: str1) {
            if (hashMap.containsKey(element)) {
                int check = hashMap.get(element);
                check++;
                hashMap.put(element,check);
            } else {
                hashMap.put(element,1);
            }
        }

        for (String element: hashMap.keySet()) {
            System.out.println("'" + element + "' occurs " + hashMap.get(element) + " times");
        }

    }
}
