package JavaStart.TestString;

import java.util.Scanner;

public class TestString19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        char[] nums = text.toCharArray();
        int a = nums[0] - '0';
        a = a * 2;
        System.out.println(nums[1] + "" + a);


    }
}

//Программа должна принимать текст из двух символов где первый символ цифра, а вторая буква. Поменяйте местами цифру и букву, а также умножьте цифру на 2.
//Ввод
//3B
//Вывод
//B6
//
//Ввод
//5M
//Вывод
//M10