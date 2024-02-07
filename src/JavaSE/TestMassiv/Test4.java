package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int a = 0; a< nums.length; a++) {
            if (nums[a]>0) {
                System.out.print(nums[a] + " ");
            }
        }

    }
}

//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Выведите в конце только положительные элементы.
//Ввод:
//10
//6 19 26 -3 46 8 5 -65 90 25
//Вывод:
//6 19 26 46 8 5 90 25
//
//Ввод:
//10
//1 2 -3 4 5 -6 7 8 -9 10
//Вывод:
//1 2 4 5 7 8 10