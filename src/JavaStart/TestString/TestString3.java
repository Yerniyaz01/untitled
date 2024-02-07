package JavaStart.TestString;

import java.util.Scanner;

public class TestString3 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String text = "BITLAB";
        String text1 = in.next();

        if (text.equals(text1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}

//Принимайте с консоли некий текст и сравните его со словом "BITLAB". Если они абсолютно идентичны, выведите на экран "YES", иначе "NO".
//Ввод
//BITLAB
//Вывод
//YES
//
//Ввод
//Bitlab
//Вывод
//NO
