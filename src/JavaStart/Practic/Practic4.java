package JavaStart.Practic;

import java.util.Scanner;

public class Practic4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a-b;

        if (c==10) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}

//Напишите программу, где ввожу два целых числа. Если первое число больше второго на 10, то выведите YES, иначе NO.
//Ввод:
//20
//10
//Вывод:
//YES
//
//Ввод:
//10
//75
//Вывод:
//NO