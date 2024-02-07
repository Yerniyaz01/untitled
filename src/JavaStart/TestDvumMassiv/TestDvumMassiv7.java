package JavaStart.TestDvumMassiv;

import java.util.Scanner;

public class TestDvumMassiv7 {
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
                if (nums[i][j]%2==0 && nums[i][j]>0) {
                    System.out.print(nums[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}

//Из массива размером NxM программа должна показывать только четные и положительные элементы.
//Ввод:
//2 3
//-5 0 3
//-1 -2 4
//Вывод:
//4
//
//Ввод:
//4 5
//7 3 4 9 -10
//16 7 -8 2 0
//9 1 -4 12 -3
//-2 6 7 -1 2
//Вывод:
//4
//16 2
//12
//6 2