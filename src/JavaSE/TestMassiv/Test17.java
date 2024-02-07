package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int sum = 1;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if (i%2==0 && nums[i]!=0) {
                sum = sum * nums[i];
            }
        }
        System.out.println(sum);

    }
}

//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Программа должна вывести умножение элементов не равных 0 и c четным индексом.
//Ввод:
//4
//9 2 4 0
//Вывод:
//36
//
//Ввод:
//10
//6 19 0 -3 4 8 0 -6 9 5
//Вывод:
//216
