package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 3;
        int sum = 0;

        while (k <= (3*n)) {
            sum = sum + k;
            k+=3;
        }
        System.out.println(sum);

    }
}

//Напишите программу которая принимает целое число (int n) и показывает сумму первых n чисел из последовательности 3, 6, 9, 12, 15, 18…
//Ввод:
//2
//Вывод:
//9
//
//Ввод:
//5
//Вывод:
//45