package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int max = Integer.MIN_VALUE;
        int a = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                a = i;
            }
        }
        System.out.println(max + " " + a);


    }
}

//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Выведите в конце максимальный элемент и его индекс.
//Ввод:
//8
//-4 9 2 16 -5 8 7 -11
//Вывод:
//16 3
//
//Ввод:
//10
//1 2 3 4 5 6 7 8 9 10
//Вывод:
//10 9
