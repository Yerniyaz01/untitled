package JavaStart.HomeWork;

import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = (2*a)+(b-3)+(c*c);

        System.out.println(d);

    }
}

//Пользователь вводит три числа. Увеличьте первое число в два раза, второе число уменьшите на 3, третье число возведите в квадрат и затем найдите сумму новых трех чисел.
//Ввод:
//2
//4
//6
//Вывод:
//41
//
//Ввод:
//3
//6
//9
//Вывод:
//90