package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a;

        while (n <= m) {
            if (n % 3 == 0) {
                a = n;
                System.out.print(a + " ");
            }
            n++;
        }

    }
}

//Напишите программу которая запрашивает с консоли два целых числа (int n и int m) и выводит на экран все числа от n до m которые делятся на 3 без остатка.
//Примечание*** Если используете % (оператор остатка) в коде, то пишите их без пробелов. Пример: Вместо (a % b) пишите (a%b), без пробелов
//Ввод:
//3 11
//Вывод:
//3 6 9
//
//Ввод:
//10 23
//Вывод:
//12 15 18 21