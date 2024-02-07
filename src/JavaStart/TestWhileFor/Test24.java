package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 1;
        int sum = 1;

        while (a<=n) {
            sum = sum * a;
            a++;
        }
        System.out.println(sum);


    }
}

//Напишите программу, в которой я ввожу число n. Программа должна вывести умножение первых n чисел. То есть 1*2*3*4*5...n.
//Ввод:
//3
//Вывод:
//6
//
//Ввод:
//5
//Вывод:
//120
