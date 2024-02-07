package JavaStart.TestDvumMassiv;

import java.util.Scanner;

public class TestDvumMassiv8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[][] nums = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                nums[i][j] = in.nextInt();
                nums[i][j] = nums[i][j] * nums[i][j];
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

//Напишите программу которая принимает значения в двумерный массив размером NxM и показывает квадраты всех элементов.
//Ввод:
//2 3
//4 5 6
//7 8 9
//Вывод:
//16 25 36
//49 64 81
//
//Ввод:
//4 5
//7 3 4 9 -10
//16 7 -8 2 0
//9 1 -4 12 -3
//-2 6 7 -1 2
//Вывод:
//49 9 16 81 100
//256 49 64 4 0
//81 1 16 144 9
//4 36 49 1 4