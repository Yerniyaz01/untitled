package JavaStart.HomeWork2;

import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int max = a;

        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        if (max < d) {
            max = d;
        }

        int e = max%2;

        if (e!=0) {
            System.out.println("NO RESULT");
        }else {
            System.out.println(max);
        }



    }
}

//Вводится четыре целых числа. Найдите наибольшее число среди них. Если наибольшее число нечетное, выведите NO RESULT, иначе выведите само число.
//Примечание*** Если используете % (оператор остатка) в коде, то пишите их без пробелов. Пример: Вместо (a % b) пишите (a%b), без пробелов
//Ввод:
//12
//37
//200
//45
//Вывод:
//200
//
//Ввод:
//92
//37
//202
//453
//Вывод:
//NO RESULT