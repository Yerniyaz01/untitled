package JavaStart.HomeWork2;

import java.util.Scanner;

public class HW10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        int min = a;

        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }

        int delen1 = max % 10;
        int deset1 = max / 10;
        int delen2 = min % 10;
        int deset2 = min / 10;

        System.out.println(delen1 + deset1 + delen2 + deset2);


    }
}

//Создайте программу, которая принимает три двухзначных, разных числа c консоли. Программа должна выводить сумму цифр наибольшего и наименьшего числа.
//Примечание*** Если используете % (оператор остатка) в коде, то пишите их без пробелов. Пример: Вместо (a % b) пишите (a%b), без пробелов
//
//Ввод:
//92
//74
//21
//Вывод:
//14
//
//Ввод:
//12
//13
//25
//Вывод:
//10