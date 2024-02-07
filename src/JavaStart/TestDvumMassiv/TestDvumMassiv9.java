package JavaStart.TestDvumMassiv;

import java.util.Scanner;

public class TestDvumMassiv9 {
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
            for (int j = 0; j < M; j++) {
                if (nums[i][j] < 0) {
                    System.out.println(i + " " + j);
                }
            }
        }

    }
}

//Программа должна напечатать индексы отрицательных чисел двумерного массива размеров NxM.
//Ввод:
//2 3
//-5 0 3
//-1 -2 4
//Вывод:
//0 0
//1 0
//1 1
//
//Ввод:
//4 5
//7 3 4 9 -10
//16 7 -8 2 0
//9 1 -4 12 -3
//-2 6 7 -1 2
//Вывод:
//0 4
//1 2
//2 2
//2 4
//3 0
//3 3
