package JavaSE.TestArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class TestArrayList16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet<String> hashSet = new HashSet<>();

        int check = 0;
        int res = 0;
        while (check == 0) {
            hashSet.add(in.next().toLowerCase());
            if (hashSet.contains("stop")) {
                break;
            }
        }
        hashSet.remove("stop");
        char[] symbol = {'a', 'e', 'i', 'o', 'u'};
        for (String element : hashSet) {
            char[] symbols = element.toCharArray();
            for (char ch : symbols) {
                for (char ch2 : symbol) {
                    if (ch == ch2) {
                        res++;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
