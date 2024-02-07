package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] nums = new int[n];

        for (int i = 0; i< nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int a = 0; a< nums.length; a++) {
            if (nums[a]%2==0) {
                System.out.print(nums[a] + " ");
            }
        }


    }
}

//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Вывести все содержащиеся в данном массиве четные числа.
//Ввод:
//8
//3 8 2 4 6 9 12 15
//Вывод:
//8 2 4 6 12
//
//Ввод:
//10
//6 0 -3 4 8 0 -6 9 5
//Вывод:
//6 0 4 8 0 -6