package JavaStart.Practic;

import java.util.Scanner;

public class Practic6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (a==b) {
            System.out.println("0");
        }else {
            System.out.println(a+b);
        }

    }
}

//Напишите программу, где я ввожу целые числа a и b, если их значения не равны, то выводить в консоль их сумму, иначе просто 0.
//Ввод:
//10
//20
//Вывод:
//30
//
//Ввод:
//10
//10
//Вывод:
//0
