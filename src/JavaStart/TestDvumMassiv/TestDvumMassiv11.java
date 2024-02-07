package JavaStart.TestDvumMassiv;

import java.util.Scanner;

public class TestDvumMassiv11 {
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
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sum = sum + nums[i][j];
            }
            System.out.println(sum);
            sum = 0;
        }

    }
}

//Выведите сумму элементов каждой строки двумерного массива размером NxM. Размер и значения задаются с консоли.
//Ввод:
//2 3
//6 2 7
//4 11 9
//Вывод:
//15
//24
//
//Ввод:
//4 5
//7 3 4 9 10
//16 7 8 2 0
//9 1 4 12 3
//11 6 7 1 2
//Вывод:
//33
//33
//29
//27