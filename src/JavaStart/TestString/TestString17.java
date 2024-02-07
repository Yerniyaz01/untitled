package JavaStart.TestString;

import java.util.Scanner;

public class TestString17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        text = text.trim();
        String contrtext = in.nextLine();
        contrtext = contrtext.trim();
        char[] nums = text.toCharArray();
        char[] count = new char[nums.length];
        int a = 0;

        for (int i = nums.length-1; i >= 0; i--) {
            count[a] = nums[i];
            a++;
        }

        text = String.valueOf(count);
        if (text.equals(contrtext)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

//Вводим строки s1 и s2 в программу. Программа должна вывести "Yes", если s2 является противоположным (в обратном чтении) s1. Иначе "No".
//Ввод
//universe
//ivery
//Вывод
//No
//
//Ввод
//macbookair
//riakoobcam
//Вывод
//Yes
