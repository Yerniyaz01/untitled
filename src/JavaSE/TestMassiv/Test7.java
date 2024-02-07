package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int a = 0; a < nums.length; a++) {
            if (a%2==0) {
                System.out.print(nums[a] + " ");
            }
        }

    }
}

//Создайте массив из целых чисел и с помощью цикла выведите все элементы с четными индексами.
//Ввод:
//8
//-4 9 2 -5 8 7 -11 16
//Вывод:
//-4 2 8 -11
//
//Ввод:
//10
//1 2 3 4 5 6 7 8 9 10
//Вывод:
//1 3 5 7 9