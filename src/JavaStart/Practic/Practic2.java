package JavaStart.Practic;

import java.util.Scanner;

public class Practic2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a%17;

        if (b==0) {
            System.out.println("DIVISIBLE BY 17");
        }

    }
}

//Напишите программу, которая проверяет делиться ли значение введенное с консоли на 17. Если значение делится, программа выводит DIVISIBLE BY 17, иначе ничего выводить не надо.
//Примечание*** Если используете % (оператор остатка) в коде, то пишите их без пробелов. Пример: Вместо (a % b) пишите (a%b), без пробелов
//Ввод:
//34
//Вывод:
//DIVISIBLE BY 17
//
//Ввод:
//21
//Вывод: