package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 1;
        int b = 1;

        while (a <= n) {
            if (n % a == 0) {
                b = a;
                System.out.print(b + " ");
            }
            a++;
        }

    }
}

//Программа должна запрашивать целое число (int n) и показать все делители этого числа включая 1 и само число n (Делитель – числа которые делятся на данное число без остатка).
//Примечание*** Если используете % (оператор остатка) в коде, то пишите их без пробелов. Пример: Вместо (a % b) пишите (a%b), без пробелов
//Ввод:
//6
//Вывод:
//1 2 3 6
//
//Ввод:
//10
//Вывод:
//1 2 5 10