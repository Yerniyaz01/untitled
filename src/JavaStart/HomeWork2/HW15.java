package JavaStart.HomeWork2;

import java.util.Scanner;

public class HW15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > b && b > c) {
            System.out.println("YES");
        } else if (a < b && b < c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}

//Даны три переменные вещественного типа: A, B, C. Если их значения упорядочены по возрастанию или убыванию, то выводить YES; в противном случае выводить NO.
//Ввод:
//2007
//2009
//2019
//Вывод:
//YES
//
//Ввод:
//678
//942
//23
//Вывод:
//NO
