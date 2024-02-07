package JavaStart.HomeWork2;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (a>b) {
            System.out.println("2");
        } else {
            System.out.println("1");
        }


    }
}

//Даны два числа. Вывести порядковый номер меньшего из них как показано в примерах ниже. (программа должна выводить 1 или 2)
//Ввод:
//1
//9
//Вывод:
//1
//
//Ввод:
//221
//19
//Вывод:
//2