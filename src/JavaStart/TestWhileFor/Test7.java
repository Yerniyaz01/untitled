package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 1;

        for (int i = 1; i <= n; i++) {
            a=a*i;
        }
        System.out.println(a);


    }
}

//Программа запрашивает целое число (int n) и выводит на экран факториал данного числа с использованием цикла for:
//Ввод:
//5
//Вывод:
//120
//
//Ввод:
//0
//Вывод:
//1