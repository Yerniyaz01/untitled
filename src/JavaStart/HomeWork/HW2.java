package JavaStart.HomeWork;

import java.util.Scanner;

public class HW2 {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        int sum = in.nextInt();
        int sum1 = sum*sum;
        int sum2 = sum*sum*sum;

        System.out.println(sum1);
        System.out.println(sum2);

    }
}

//Напишите программу, в которой я ввожу число, выведите в консоли квадрат и куб этого числа.
//Ввод:
//2
//Вывод:
//4
//8
//
//Ввод:
//6
//Вывод:
//36
//216