package JavaStart.TestDvumMassiv;

import java.util.Scanner;

public class TestDvumMassiv3 {
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

        int K = in.nextInt();
        for (int i = 0; i < M; i++) {
            System.out.print(nums[K][i] + " ");
        }

    }
}

//Напишите программу в котором я ввожу два числа N и M. Затем создаю двумерный массив NxM. Далее мы заполняем этот массив числами. После заполнения программа запрашивает число K и показывает элементы только этой строки.
//Ввод:
//2 3
//1 6 10
//2 5 9
//1
//Вывод:
//2 5 9
//
//Ввод:
//3 3
//1 2 3
//2 7 4
//3 4 6
//2
//Вывод:
//3 4 6