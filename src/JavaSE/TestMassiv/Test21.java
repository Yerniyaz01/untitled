package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println(min + " " + max);

    }
}

//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Программа должна вывести максимальное и минимальное значение в массиве.
//Ввод:
//4
//4 9 2 5
//Вывод:
//2 9
//
//Ввод:
//10
//1 2 -1 4 5 56 7 8 9 -21
//Вывод:
//-21 56
