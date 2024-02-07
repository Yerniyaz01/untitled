package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;

        while (n <= m) {
            sum = sum + n;

            n++;
        }
        System.out.println(sum);

    }
}

//Напишите программу которая принимает два целых числа int n и int m и выводит сумму всех чисел от n до m.
//*Подсказка: создайте дополнительную переменную int sum=0 к которой вы будете прибавлять числа на каждом кругу цикла
//Ввод:
//3 6
//Вывод:
//18
//
//Ввод:
//1 5
//Вывод:
//15