package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 1;
        int sum = 0;

        while (a <= n) {
            sum = sum + a;
            a++;
        }
        System.out.println(sum);

    }
}

//Напишите программу которая принимает целое число int n и выводит сумму всех чисел от 1 до n. Результат = 1 + 2 + 3 + 4 + 5 + … + n
//*Подсказка: создайте дополнительную переменную int sum=0 к которой вы будете прибавлять числа на каждом кругу цикла
//Ввод:
//3
//Вывод:
//6
//
//Ввод:
//5
//Вывод:
//15