package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int[] sum = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
            sum[i] = nums[i];
        }
        for (int i = 0; i < sum.length; i++) {
            if (sum[i]%2==0) {
                System.out.print(sum[i] + " ");
            }
        }

    }
}

//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Создайте второй массив из четных элементов первого массива.
//Ввод:
//8
//4 9 2 5 8 7 11 16
//Вывод:
//4 2 8 16
//
//Ввод:
//10
//6 19 26 3 46 8 5 65 90 25
//Вывод:
//6 26 46 8 90
