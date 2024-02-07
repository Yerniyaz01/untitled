package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int count = 0;

        while (true) {
            n = in.nextInt();
            if (n == 0) {
                break;
            }
            count = count + n;
        }
        System.out.println(count);


    }
}

//Напишите программу, которая запрашивает числа. Программа должна остановиться запрашивать, когда мы вводим 0. Программа должна вывести сумму введенных чисел.
//*Подсказка: Пропишите в условии цикла ВВОДИМОЕ ЦИСЛО!=0
//Ввод:
//1 2 3 4 5 0
//Вывод:
//15
//
//Ввод:
//26 7 2 9 12 4 0
//Вывод:
//60