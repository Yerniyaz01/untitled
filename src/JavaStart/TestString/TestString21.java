package JavaStart.TestString;

import java.util.Scanner;

public class TestString21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        char[] nums = text.toCharArray();

        for (int i = 0; i < nums.length; i++) {
            char c = nums[i];
            if (Character.isUpperCase(c)) {
                nums[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                nums[i] = Character.toUpperCase(c);
            }
        }
        System.out.println(new String(nums));

    }
}

//Напишите программу, которая преобразует все заглавные символы строки в нижний регистр.
//Ввод
//Elon Musk
//Вывод
//eLON mUSK
//
//Ввод
//SpaceX Corporation
//Вывод
//sPACEx cORPORATION
