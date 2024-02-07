package JavaStart.TestDvumMassiv;

import java.util.Scanner;

public class TestDvumMassiv2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        N = N * 2;
        int[][] nums = new int[1][N];

        for (int i = 0; i < N; i++) {
            nums[0][i] = in.nextInt();
        }
        for (int i = 0; i < N / 2; i++) {
            System.out.print(nums[0][i] + " ");
        }
        System.out.println();
        for (int i = N/2; i < N; i++) {
            System.out.print(nums[0][i] + " ");
        }

    }
}

//Создайте двумерный массив размером 2xN из целых чисел и с помощью цикла выведите элементы каждого одномерного массива в отдельной строке.
//Ввод:
//3
//1 2 3 4 5 6
//Вывод:
//1 2 3
//4 5 6
//
//Ввод:
//6
//5 7 3 71 4 7 10 2 5 7 8 4
//Вывод:
//5 7 3 71 4 7
//10 2 5 7 8 4