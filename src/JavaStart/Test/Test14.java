package JavaStart.Test;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rubl = in.nextInt();
        int tenge = rubl * 6;

        System.out.println(tenge);

    }
}

//Напишите программу, которая принимает с консоли значение в рублях и выводит в тенге. (Курс: 1 рубль = 6 тенге)
//Ввод:
//1000
//Вывод:
//6000
//
//Ввод:
//700
//Вывод:
//4200