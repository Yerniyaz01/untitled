package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        while (n<=m) {
            System.out.print(n + " ");
            n++;
        }


    }
}

//Напишите программу которая запрашивает с консоли два целых чисел (int n и int m) и выводит на экран все числа от n до m.
//*Подсказка: Для вывода чисел на одной строке можно использовать System.out.print() вместо System.out.println()
//Ввод:
//5 10
//Вывод:
//5 6 7 8 9 10
//
//Ввод:
//2 9
//Вывод:
//2 3 4 5 6 7 8 9
