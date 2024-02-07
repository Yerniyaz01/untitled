package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;
        int a = 0;

        while (n <= m) {
            if (n % 2 == 0) {
                a = n;
                sum = sum + a;
            }
            n++;
        }
        System.out.println(sum);

    }
}

//Напишите программу которая принимает два целых числа int n и int m и выводит сумму всех ЧЕТНЫХ чисел от n до m.
//Примечание*** Если используете % (оператор остатка) в коде, то пишите их без пробелов. Пример: Вместо (a % b) пишите (a%b), без пробелов
//Ввод:
//1 3
//Вывод:
//2
//
//Ввод:
//5 10
//Вывод:
//24