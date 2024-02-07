package JavaStart.HomeWork2;

import java.util.Scanner;

public class HW13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if (a + b == c + d) {
            System.out.println("YES");
        } else if ((a - c == 1 && b - d == 1) || (c - a == 1 && d - b == 1)) {
            System.out.println("YES");
        } else if ((a - c == 2 && b - d == 2) || (c - a == 2 && d - b == 2)) {
            System.out.println("YES");
        } else if ((a - c == 3 && b - d == 3) || (c - a == 3 && d - b == 3)) {
            System.out.println("YES");
        } else if ((a - c == 4 && b - d == 4) || (c - a == 4 && d - b == 4)) {
            System.out.println("YES");
        } else if ((a - c == 5 && b - d == 5) || (c - a == 5 && d - b == 5)) {
            System.out.println("YES");
        } else if ((a - c == 6 && b - d == 6) || (c - a == 6 && d - b == 6)) {
            System.out.println("YES");
        } else if ((a - c == 7 && b - d == 7) || (c - a == 7 && d - b == 7)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}

//Требуется определить, бьет ли слон, стоящая на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.
//Вводятся четыре числа: координаты слона (два числа) и координаты другой фигуры (два числа), каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.
//Требуется вывести слово YES, если слон сможет побить фигуру за 1 ход и NO - в противном случае. Слон ходит по диагональным линиям. "X" - образно
//Ввод:
//1
//1
//2
//2
//Вывод:
//YES
//
//Ввод:
//1
//1
//2
//1
//Вывод:
//NO