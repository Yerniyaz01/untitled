package JavaStart.TestDvumMassiv;

import java.util.Scanner;

public class TestDvumMassiv18 {
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
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (max<nums[i][j]) max = nums[i][j];
            }
            System.out.println(max);
            max=0;
        }

    }
}

//Напишите программу в котором я ввожу два числа N и M. Затем создаю двумерный массив NxM. Далее мы заполняем этот массив числами. Программа должна вывести максимальный элемент в каждой строке.
//Ввод:
//2 3
//0 -2 3
//-5 8 -8
//Вывод:
//3
//8
//
//Ввод:
//4 5
//2 -4 -5 6 7
//0 1 -2 9 11
//-1 -1 8 3 0
//3 4 5 6 7
//Вывод:
//7
//11
//8
//7