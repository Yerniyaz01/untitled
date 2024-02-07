package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;

        while (true) {
            n = in.nextInt();
            if (n==0) {
                break;
            }
            if (n%2!=0) {
                sum = sum + n;
            }
        }
        System.out.println(sum);


    }
}

//Напишите программу, которая запрашивает числа. Программа должна остановиться запрашивать, когда мы вводим 0. Программа должна вывести сумму нечетных элементов, которые мы вводили.
//Примечание: числа -1, -3, -5 и так далее тоже являются нечетными
//Примечание*** Если используете % (оператор остатка) в коде, то пишите их без пробелов. Пример: Вместо (a % b) пишите (a%b), без пробелов
//Ввод:
//3 4 0
//Вывод:
//3
//
//Ввод:
//-3 5 8 2 7 0
//Вывод:
//9
