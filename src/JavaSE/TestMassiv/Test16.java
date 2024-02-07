package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int k = in.nextInt();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%k==0) {
                System.out.print(nums[i] + " ");
            }
        }

    }
}

//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Затем программа запрашивает число k. Вывести все числа в массиве, которые делятся на k без остатка.
//Ввод:
//8
//3 8 2 4 6 9 12 15
//3
//Вывод:
//3 6 9 12 15
//
//Ввод:
//10
//6 19 0 -3 4 8 0 -6 9 5
//2
//Вывод:
//6 0 4 8 0 -6