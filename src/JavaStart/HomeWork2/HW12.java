package JavaStart.HomeWork2;

import java.util.Scanner;

public class HW12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        int min = a;

        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }

        int d = a + b + c;

        System.out.println(d - max - min);

    }
}

//В консоль вводятся три числа. Найдите среднее из них (не наименьшее и не наибольшее) и введите в консоль.
//Ввод:
//41
//57
//2
//Вывод:
//41
//
//Ввод:
//121
//9
//3
//Вывод:
//9