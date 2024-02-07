package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test22 {
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
            if (max < nums[i]) max = nums[i];
            if (min > nums[i]) min = nums[i];
        }
        System.out.println(max - min);


    }
}

//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Выведите в конце разность между максимальным и минимальными элементами.
//Ввод:
//8
//4 9 2 5 8 7 11 16
//Вывод:
//14
//
//Ввод:
//10
//1 2 3 4 5 6 7 8 9 10
//Вывод:
//9