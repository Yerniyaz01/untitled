package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        double sum = 0;
        double count = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int a = 0; a < nums.length; a++) {
            sum = sum + (double) nums[a];
            count ++;
        }
        sum = sum / count;

        for (int b = 0; b < nums.length; b++) {
            if (nums[b]>sum) {
                System.out.print(nums[b] + " ");
            }
        }
    }
}


//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Выведите в конце элементы массива, которые больше среднего арифметического.
//Ввод:
//8
//4 9 2 5 8 7 11 16
//Вывод:
//9 8 11 16
//
//Ввод:
//10
//1 2 3 4 5 6 7 8 9 10
//Вывод:
//6 7 8 9 10