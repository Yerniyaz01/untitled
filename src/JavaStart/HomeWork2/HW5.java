package JavaStart.HomeWork2;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a==b || a==c || b==c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

//Напишите программу, где вводятся три числа с консоли. Если среди них есть одинаковые, то программа должна выводить YES, иначе NO.
//Ввод:
//17
//18
//19
//Вывод:
//NO
//
//Ввод:
//19
//221
//19
//Вывод:
//YES