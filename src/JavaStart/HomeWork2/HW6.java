package JavaStart.HomeWork2;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a%4;
        int c = a/100;
        int d = a/400;

        if (b==0 && c!=0 || d==0) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}

//Напишите программу где дано натуральное число. Требуется определить, является ли год високосным. Если год является високосным, то выведите YES, иначе выведите NO. (Напомним, что год является високосным, если его номер делится на 4, но не делится на 100, или если он делится на 400.)
//Примечание*** Если используете % (оператор остатка) в коде, то пишите их без пробелов. Пример: Вместо (a % b) пишите (a%b), без пробелов
//Ввод:
//2020
//Вывод:
//YES
//
//Ввод:
//2007
//Вывод:
//NO