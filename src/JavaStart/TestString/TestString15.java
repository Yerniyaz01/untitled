package JavaStart.TestString;

import java.util.Scanner;

public class TestString15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        text = text.toLowerCase();
        char[] symbol = {'a', 'e', 'i', 'o', 'u'};
        int a = 0;
        char[] text1 = text.toCharArray();

        for (char ch : text1) {
            for (char ch2 : symbol) {
                if (ch == ch2) {
                    a++;
                }
            }
        }
        System.out.println(a);

    }
}

//Мы вводим строку (текст) в нашу программу. Программа должна вывести количество гласных букв. (Гласные буквы: a, e, i, o, u)
//Ввод
//Tesla
//Вывод
//2
//
//Ввод
//Google
//Вывод
//3