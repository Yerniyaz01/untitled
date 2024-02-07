package JavaStart.Practic;

import java.util.Scanner;

public class Practic12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a<b && a<c) {
            System.out.println(a);
        } else if (b<a && b<c) {
            System.out.println(b);
        } else if (c<a && c<b) {
            System.out.println(c);
        } else {
            System.out.println("Error");
        }

    }
}

//Напишите программу, где c консоли вводятся три целых числа. Найдите наименьшее число из них и выведете в консоль.
//Ввод:
//15
//44
//-12
//Вывод:
//-12
//
//Ввод:
//19
//37
//201
//Вывод:
//19
