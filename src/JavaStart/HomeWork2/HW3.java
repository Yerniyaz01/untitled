package JavaStart.HomeWork2;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a>b && a>c) {
            System.out.println(a);
        } else if (b>a && b>c) {
            System.out.println(b);
        } else if (c>a && c>b) {
            System.out.println(c);
        } else {
            System.out.println("ERROR");
        }

    }
}

//Напишите программу, которая принимает три целых числа и выводит в консоль наибольшее среди них.
//Ввод:
//17
//18
//19
//Вывод:
//19
//
//Ввод:
//89
//221
//19
//Вывод:
//221
