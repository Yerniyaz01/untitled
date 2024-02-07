package JavaStart.HomeWork;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = (3*(x*x))-(6*x)-7;
        System.out.println(y);

    }
}

//Напишите программу в которой я ввожу целое число x. Найти значение y = 3x^2 - 6x - 7 при данном значении x.
//Ввод:
//2
//Вывод:
//-7
//
//Ввод:
//5
//Вывод:
//38