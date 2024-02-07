package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println(max);


    }
}

//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Выведите в конце максимальный элемент массива.
//Ввод:
//4
//4 9 2 5
//Вывод:
//9
//
//Ввод:
//10
//4 9 2 5 15 7 11 3 8 1
//Вывод:
//15