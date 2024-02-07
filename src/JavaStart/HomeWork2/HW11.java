package JavaStart.HomeWork2;

import java.util.Scanner;

public class HW11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if (a!=b && a!=c && a!=d) {
            System.out.println(1);
        } else if (b!=a && b!=c && b!=d) {
            System.out.println(2);
        } else if (c!=a && c!=b && c!=d) {
            System.out.println(3);
        } else if (d!=a && d!=b && d!=c) {
            System.out.println(4);
        } else {
            System.out.println("ERROR");
        }

    }
}

//Даны четыре целых числа, одно из которых отлично от трех других, равных между собой. Определить порядковый номер числа, отличного от остальных и выведете результат как показано в примерах.
//Ввод:
//92
//92
//21
//92
//Вывод:
//3
//
//Ввод:
//12
//25
//25
//25
//Вывод:
//1