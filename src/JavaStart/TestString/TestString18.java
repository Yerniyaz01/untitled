package JavaStart.TestString;

import java.util.Scanner;

public class TestString18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        text = text.trim();
        char[] nums = text.toCharArray();
        char[] count = new char[nums.length];
        int a = 0;

        for (int i = nums.length-1; i >= 0; i--) {
            count[a] = nums[i];
            a++;
        }
        String contrtext = String.valueOf(count);
        if (contrtext.equals(text)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

//Мы вводим строку (текст) в нашу программу. Программа должна определить, является ли наш текст "Палиндром"-ом или нет. Палиндром - это когда текст читается так же одинаково если ее читать в обратном порядке.
//Ввод
//kazak
//Вывод
//Yes
//
//Ввод
//Assets
//Вывод
//No
