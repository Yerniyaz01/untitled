package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = nums.length-1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }


    }
}

//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Выведите в конце все элементы в обратном порядке.
//Ввод:
//10
//6 19 26 -3 46 8 5 -65 90 25
//Вывод:
//25 90 -65 5 8 46 -3 26 19 6
//
//Ввод:
//10
//1 2 3 4 5 6 7 8 9 10
//Вывод:
//10 9 8 7 6 5 4 3 2 1