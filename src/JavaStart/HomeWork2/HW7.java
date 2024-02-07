package JavaStart.HomeWork2;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = a;
        int min = a;
        if (max<b) {
            max = b;
        }
        if (max<c) {
            max = c;
        }
        if (min>b) {
            min = b;
        }
        if (min>c) {
            min = c;
        }
        System.out.println(max-min);

    }
}

//Создайте программу, которая выводит разницу максимального и минимального значения из трех введенных, разных чисел.
//Ввод:
//212
//912
//445
//Вывод:
//700
//
//Ввод:
//121
//999
//1030
//Вывод:
//909
