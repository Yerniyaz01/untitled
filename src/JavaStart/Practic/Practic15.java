package JavaStart.Practic;

import java.util.Scanner;

public class Practic15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a-b;
        int d = b-a;

        if (c>=100 || d>=100) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

//Напишите программу, которая принимает с консоли два целых числовых значения и выводит YES если их разница равна или больше 100 и выводит NO, если не проходит по условию.
//Ввод:
//15
//-200
//Вывод:
//YES
//
//Ввод:
//121
//202
//Вывод:
//NO