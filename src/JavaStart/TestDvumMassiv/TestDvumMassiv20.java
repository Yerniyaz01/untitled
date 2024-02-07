package JavaStart.TestDvumMassiv;

import java.util.Scanner;

public class TestDvumMassiv20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] nums = new int[N][N];
        int a = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                nums[i][j] = in.nextInt();
            }
            a++;
        }
        int[] arr = new int[a];
        a--;
        for (int i = 0; i < N; i++) {
           arr[i] = nums[a][i];
           nums[a][i] = nums[0][i];
        }
        for (int i = 0; i < N; i++) {
            nums[0][i] = arr[i];
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}

//Программа запрашивает число N, затем мы создаем двумерный массив N x N и заполняем их числами. Программа должна заменить первую нулевую строку массива на последнюю строку массива.
//Ввод:
//3
//1 2 3
//2 7 4
//3 4 6
//Вывод:
//3 4 6
//2 7 4
//1 2 3
//
//Ввод:
//5
//1 2 3 4 5
//7 6 4 2 3
//0 7 8 9 4
//8 9 0 1 5
//5 2 3 7 6
//Вывод:
//5 2 3 7 6
//7 6 4 2 3
//0 7 8 9 4
//8 9 0 1 5
//1 2 3 4 5