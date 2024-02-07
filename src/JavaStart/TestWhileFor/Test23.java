package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int max = Integer.MIN_VALUE;
        int a = 0;

        while (true) {
            n = in.nextInt();
            if (n == 0) {
                break;
            }
            if (max<n) {
                max = n;
            }

        }
        System.out.println(max);


    }
}

//Напишите программу, которая запрашивает числа. Программа должна остановиться запрашивать, когда мы вводим 0. Программа должна вывести максимальное значение из всех чисел.
//Ввод:
//1 2 3 4 5 0
//Вывод:
//5
//
//Ввод:
//26 7 2 9 12 4 0
//Вывод:
//26

