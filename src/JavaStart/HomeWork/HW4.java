package JavaStart.HomeWork;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = 4*(x-3)-7*(x-3)+2;
        System.out.println(y);

    }
}

//Напишите программу в которой я ввожу целое число x. Найти значение y = 4(x - 3) - 7(x - 3) + 2 при данном значении x.
//Ввод:
//4
//Вывод:
//-1
//
//Ввод:
//-4
//Вывод:
//23