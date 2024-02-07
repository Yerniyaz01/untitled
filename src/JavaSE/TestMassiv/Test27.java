package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                a = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
                b = i;
            }
        }

        nums[a] = min;
        nums[b] = max;


        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }


    }
}

//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Программа должна заменить местами максимальный и минимальный элементы.
//Ввод:
//3
//4 9 2
//Вывод:
//4 2 9
//
//Ввод:
//10
//1 2 3 4 5 6 7 8 9 10
//Вывод:
//10 2 3 4 5 6 7 8 9 1