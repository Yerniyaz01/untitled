package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b;

        for (int i = 1; i<10; i++) {
            b=i*a;
            System.out.println(i + " " + b);
        }

    }
}

//Напишите программу которая запрашивает с консоли целое число. Сделайте программу для печати таблицы умножения заданного числа с помощью цикла for.
//Ввод:
//5
//Вывод:
//1 5
//2 10
//3 15
//4 20
//5 25
//6 30
//7 35
//8 40
//9 45
//
//Ввод:
//0
//Вывод:
//1 0
//2 0
//3 0
//4 0
//5 0
//6 0
//7 0
//8 0
//9 0