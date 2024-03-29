package JavaStart.HomeWork2;

import java.util.Scanner;

public class HW14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a%4;
        int c = a%100;
        int d = a%400;

        if ((b==0 && c!=0) || d==0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

//Дан номер года (положительное целое число). Определить количество дней в этом году, учитывая, что обычный год насчитывает 365 дней, а високосный - 366 дней. Високосным считается год, делящийся на 4, за исключением тех годов, которые делятся на 100 и не делятся на 400 (например, годы 300, 1300 и 1900 не являются високосными, а 1200 и 2000 -являются). Если год является високосным, то программа выводит YES, иначе выведите NO.
//Примечание*** Если используете % (оператор остатка) в коде, то пишите их без пробелов. Пример: Вместо (a % b) пишите (a%b), без пробелов
//Ввод:
//2007
//Вывод:
//NO
//
//Ввод:
//2008
//Вывод:
//YES