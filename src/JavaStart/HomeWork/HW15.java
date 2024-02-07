package JavaStart.HomeWork;

import java.util.Scanner;

public class HW15 {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        int S = in.nextInt();
        int a = S%100/10;
        int b = S%10;

        System.out.println(b);
        System.out.println(a);

    }
}

//Дано трехзначное число. Вывести вначале его последнюю цифру (единицы), а затем - его среднюю цифру (десятки).
//Ввод:
//351
//Вывод:
//1
//5
//
//Ввод:
//236
//Вывод:
//6
//3