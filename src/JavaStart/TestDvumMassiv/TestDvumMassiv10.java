package JavaStart.TestDvumMassiv;

import java.util.Scanner;

public class TestDvumMassiv10 {
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
                if (i % 2 == 0 && j % 2 == 0) {
                    sum = sum + nums[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}

//Создайте программу которая принимает значения для массива размером NxM и находит сумму всех его элементов, имеющих оба четных индекса.
//Ввод:
//3 3
//6 2 7
//4 11 9
//8 3 1
//Вывод:
//22
//
//Ввод:
//4 5
//7 3 4 9 10
//16 7 8 2 0
//9 1 4 12 3
//11 6 7 1 2
//Вывод:
//37
//*22 = 6 + 7 + 8 + 1
//6 имеет индекс 0,0
//7 имеет индекс 0,2
//8 имеет индекс 2,0
//1 имеет индекс 2,2