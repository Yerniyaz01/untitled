package JavaStart.TestDvumMassiv;

import java.util.Scanner;

public class TestDvumMassiv6 {
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
                if (nums[i][j]>=0) {
                    System.out.print(nums[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}

//Создайте программу которая принимает массив с размером NxM со значениями и показывает только положительные элементы в нем.
//Ввод:
//2 3
//-5 0 3
//-1 -2 4
//Вывод:
//0 3
//4
//
//Ввод:
//4 5
//7 3 4 9 -10
//16 7 -8 2 0
//9 1 -4 12 -3
//-2 6 7 -1 2
//Вывод:
//7 3 4 9
//16 7 2 0
//9 1 12
//6 7 2