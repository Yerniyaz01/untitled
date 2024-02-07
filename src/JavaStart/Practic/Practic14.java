package JavaStart.Practic;

import java.util.Scanner;

public class Practic14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a%3;
        int c = a%5;

        if (b==0 || c==0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

//Создайте программу, которая принимает с консоли целое число. Затем программа должна проверить и вывести YES если значение делится на 3 или 5 без остатка, иначе NO.
//Примечание*** Если используете % (оператор остатка) в коде, то пишите их без пробелов. Пример: Вместо (a % b) пишите (a%b), без пробелов
//Ввод:
//15
//Вывод:
//YES
//
//Ввод:
//121
//Вывод:
//NO
