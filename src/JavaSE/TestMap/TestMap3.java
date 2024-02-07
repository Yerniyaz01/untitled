package JavaSE.TestMap;

import java.util.HashMap;
import java.util.Scanner;

public class TestMap3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashMap<String, Integer> hashMap = new HashMap<>();

        boolean check = true;
        while (check) {
            hashMap.put(in.next(), in.nextInt());
            if (hashMap.size()==5) {
                break;
            }
        }
        for (String ele: hashMap.keySet()) {
            System.out.println(ele + " scored " + hashMap.get(ele) + " goals in EPL");
        }

    }
}
