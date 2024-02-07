package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println(min * min);


    }
}

//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Выведите в конце минимальный элемент умноженное на самого себя.
//Ввод:
//8
//4 9 2 5 8 7 11 16
//Вывод:
//4
//
//Ввод:
//10
//6 19 26 3 46 8 5 65 90 25
//Вывод:
//9

