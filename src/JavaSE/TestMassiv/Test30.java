package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                a ++;
            } else if (nums[i]++ < 0) {
                a--;
            }
        }

        if (a == 0 || a == 1 || a == -1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Программа должна проверить чередуются ли в нем положительные и отрицательные числа. Если чередуются, то вывести YES, иначе NO.
//Ввод:
//6
//8 -2 4 6 9 12
//Вывод:
//NO
//
//Ввод:
//6
//4 -2 7 -5 13 -16
//Вывод:
//YES