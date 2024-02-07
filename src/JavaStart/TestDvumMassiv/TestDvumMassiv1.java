package JavaStart.TestDvumMassiv;

import java.util.Scanner;

public class TestDvumMassiv1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums[][] = {
                {12, 5, 7, 6},
                {4, 0, 2, 7},
                {9, 1, 3, 2},
                {10, -2, 4, 6},
        };

        int N = in.nextInt();
        int M = in.nextInt();

        System.out.println(nums[N][M]);
    }
}

//Создайте двумерный массив и заполните значениями - {{12,5,7,6},{4,0,2,7},{9,1,3,2},{10,-2,4,6}}. С консоли примите два числа N и M, и покажите на экране значение которое хранится по этому индексу.
//Ввод:
//1 2
//Вывод:
//2
//
//Ввод:
//3 1
//Вывод:
//-2
