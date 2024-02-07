package JavaStart.HomeWork2;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (a>b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }
}

//Даны два целых числа. Выведите значение наибольшего из них.
//
//Ввод:
//17
//81
//Вывод:
//81
//
//Ввод:
//872
//976
//Вывод:
//976
