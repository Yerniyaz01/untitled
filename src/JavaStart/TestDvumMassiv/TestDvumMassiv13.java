package JavaStart.TestDvumMassiv;

import java.util.Scanner;

public class TestDvumMassiv13 {
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
                if (nums[i][j] % 2 != 0) {
                    nums[i][j] = 0;
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

//Программа должна заменить все нечетные элементы двумерного массива на 0 и вывести результат на экран.
//Ввод:
//2 3
//6 2 7
//4 11 9
//Вывод:
//6 2 0
//4 0 0
//
//Ввод:
//4 5
//7 3 4 9 10
//16 7 8 2 0
//9 1 4 12 3
//12 6 7 1 2
//Вывод:
//0 0 4 0 10
//16 0 8 2 0
//0 0 4 12 0
//12 6 0 0 2