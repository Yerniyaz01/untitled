package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                a = i;
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                b = i;
            }
        }

        int sum = 0;
        for (int i = a; i < b; i++) {
            sum = sum + nums[i];
        }
        System.out.println(sum);
    }
}

//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Программа должна вывести сумму всех чисел которые находятся между нулями.
//Ввод:
//4
//0 -2 4 0
//Вывод:
//2
//
//Ввод:
//10
//6 19 0 -3 4 8 0 -6 9 5
//Вывод:
//9