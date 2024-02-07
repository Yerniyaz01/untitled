package JavaStart.TestDvumMassiv;

import java.util.Scanner;

public class TestDvumMassiv12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[][] nums = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                nums[i][j] = in.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        int a = 0;
        int b = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (max < nums[i][j]) {
                    max = nums[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(a + " " + b);

    }
}

//Напишите программу которая находит и выводит максимальное значение в двумерном массиве, а также выводит его индекс.
//Ввод:
//2 3
//6 2 7
//4 11 9
//Вывод:
//11
//1 1
//
//Ввод:
//4 5
//7 3 4 9 10
//16 7 8 2 0
//9 1 4 12 3
//11 6 7 1 2
//Вывод:
//16
//1 0