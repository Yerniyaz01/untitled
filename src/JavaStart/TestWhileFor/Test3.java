package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = 0;

        while (b<a) {
            b++;
            System.out.print(b + " ");
        }


    }
}

//Напишите программу которая запрашивает с консоли целостное число (int n) и выводит на экран все числа от 1 до n (введенное число).
//*Подсказка: Для вывода чисел на одной строке можно использовать System.out.print() вместо System.out.println()
//Ввод:
//5
//Вывод:
//1 2 3 4 5
//
//Ввод:
//10
//Вывод:
//1 2 3 4 5 6 7 8 9 10