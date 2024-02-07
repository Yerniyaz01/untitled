package JavaStart.TestDvumMassiv;

import java.util.Scanner;

public class TestDvumMassiv17 {
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
        for (int i = N-1; i >= 0; i--) {
            for (int j = 0; j < M; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}

//Напишите программу которая выводит двумерный массив в зеркальном отражении относительно горизонтали.
//Ввод:
//2 3
//6 2 7
//4 11 9
//Вывод:
//4 11 9
//6 2 7
//
//Ввод:
//4 5
//7 3 4 9 10
//16 7 8 2 9
//9 1 4 12 3
//12 6 7 0 2
//Вывод:
//12 6 7 0 2
//9 1 4 12 3
//16 7 8 2 9
//7 3 4 9 10