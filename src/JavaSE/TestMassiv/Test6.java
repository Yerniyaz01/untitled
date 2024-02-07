package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int a = 0; a < nums.length; a++) {
            System.out.print(nums[a] * nums[a] + " ");
        }

    }
}

//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Выведите в конце квадраты всех введенных чисел.
//Ввод:
//6
//1 2 3 4 5 6
//Вывод:
//1 4 9 16 25 36
//
//Ввод:
//10 1 2 3 4 5 6 7 8 9 10
//Вывод:
//1 4 9 16 25 36 49 64 81 100