package JavaStart.HomeWork;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int V = a*b*c;
        int S = 2*((a*b)+(b*c)+(a*c));
        System.out.print(V + " " + S);

    }
}

//Напишите программу, которая принимает в консоли длину ребер a, b, c прямоугольного параллелепипеда. Программа должна найти объем и площадь поверхности прямоугольного параллелепипеда и вывести результат в консоль через пробел, на одной строке, как показано в примерах.
//**Подсказка: Формулы объема (V = a·b·c) и площади поверхности (S = 2·(a·b + b·c + a·c))
//Ввод:
//2
//2
//2
//Вывод:
//8 24
//
//Ввод:
//5
//4
//1
//Вывод:
//20 58