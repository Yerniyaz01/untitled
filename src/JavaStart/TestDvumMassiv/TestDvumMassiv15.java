package JavaStart.TestDvumMassiv;

import java.util.Scanner;

public class TestDvumMassiv15 {
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
        int k = in.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (nums[i][j] % k == 0) {
                    nums[i][j] = nums[i][j] / k;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}

//Напишите программу которая принимает значения в двумерный массив размером NxM, а также некое число k. Если элемент массива делится на k без остатка, программа должна заменить этот элемент на результат деления этого числа на k.
//Ввод:
//2 3
//6 2 7
//4 11 9
//2
//Вывод:
//3 1 7
//2 11 9
//
//Ввод:
//4 5
//7 3 4 9 10
//16 7 8 2 9
//9 1 4 12 3
//12 6 7 0 2
//4
//Вывод:
//7 3 1 9 10
//4 7 2 2 9
//9 1 1 3 3
//3 6 7 0 2