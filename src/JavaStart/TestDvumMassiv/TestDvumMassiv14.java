package JavaStart.TestDvumMassiv;

import java.util.Scanner;

public class TestDvumMassiv14 {
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
        int min = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (max < nums[i][j]) {
                    max = nums[i][j];
                    a = i;
                    b = j;
                }
                if (min > nums[i][j]) {
                    min = nums[i][j];
                    c = i;
                    d = j;
                }
            }
        }
        int e = 0;
        e = nums[a][b];
        nums[a][b] = nums[c][d];
        nums[c][d] = e;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }


    }
}

//Ваша программа должна находить в двумерном массиве минимальный и максимальный элементы, затем поменять их местами в массиве.
//Ввод:
//2 3
//6 2 7
//4 11 9
//Вывод:
//6 11 7
//4 2 9
//
//Ввод:
//4 5
//7 3 4 9 10
//16 7 8 2 9
//9 1 4 12 3
//12 6 7 0 2
//Вывод:
//7 3 4 9 10
//0 7 8 2 9
//9 1 4 12 3
//12 6 7 16 2