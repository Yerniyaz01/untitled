package JavaStart.HomeWork;

import java.util.Scanner;

public class HW3 {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        double d = in.nextDouble();
        double Pi = 3.14;
        double L = Pi * d;

        System.out.println(L);

    }
}

//Напишите программу, в которой я ввожу диаметр окружности d. Найти ее длину L = π·d. В качестве значения π использовать 3.14.
//Ввод:
//10
//Вывод:
//31.4
//
//Ввод:
//8
//Вывод:
//25.12