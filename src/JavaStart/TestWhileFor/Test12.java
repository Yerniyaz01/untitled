package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a = 1;
        int b ;

        while (a <= N) {
            b = a * a;
            System.out.println(a + " " + b);

            a++;
        }


    }
}

//Введите в программу целое число (int N). Программа должна вывести все числа от 1 до N и их квадраты.
//Ввод:
//3
//Вывод:
//1 1
//2 4
//3 9
//
//Ввод:
//5
//Вывод:
//1 1
//2 4
//3 9
//4 16
//5 25