package JavaStart.TestDvumMassiv;

import java.util.Scanner;

public class TestDvumMassiv16 {
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
        for (int i = 0; i < N; i++) {
            for (int j = M-1; j >= 0; j--) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Напишите программу которая выводит двумерный массив в зеркальном отражении относительно вертикали.
//Ввод:
//2 3
//6 2 7
//4 11 9
//Вывод:
//7 2 6
//9 11 4
//
//Ввод:
//4 5
//7 3 4 9 10
//16 7 8 2 9
//9 1 4 12 3
//12 6 7 0 2
//Вывод:
//10 9 4 3 7
//9 2 8 7 16
//3 12 4 1 9
//2 0 7 6 12