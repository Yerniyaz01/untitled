package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int sum = 0;
        double b = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int a = 0; a < nums.length; a++) {
            if (nums[a] % 2 == 0 || nums[a] == 0) {
                sum = sum + nums[a];
                b++;
            }
        }
        System.out.print((double)sum/b);


    }
}

//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Программа должна вывести среднее арифметическое всех четных элементов массива. (Число 0 тоже четный элемент)
//Ввод:
//8
//3 4 2 2 6 9 1 8
//Вывод:
//4.4
//
//Ввод:
//10
//6 19 0 -3 4 8 0 9 9 5
//Вывод:
//3.6
