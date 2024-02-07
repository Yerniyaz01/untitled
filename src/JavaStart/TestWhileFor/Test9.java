package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a = 0;

        while (n <= m) {
            if (n%2!=0) {
                a = n;
                System.out.print(a + " ");
            }
            n++;
        }


    }
}

//Напишите программу которая запрашивает с консоли два целых числа (int n и int m) и выводит на экран все НЕЧЕТНЫЕ числа от n до m.
//Примечание*** Если используете % (оператор остатка) в коде, то пишите их без пробелов. Пример: Вместо (a % b) пишите (a%b), без пробелов
//Ввод:
//3 11
//Вывод:
//3 5 7 9 11
//
//Ввод:
//10 23
//Вывод:
//11 13 15 17 19 21 23