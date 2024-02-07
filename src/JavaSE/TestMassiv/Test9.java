package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        int b = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int a = 0; a < nums.length; a++) {
            if (nums[a]>=0) {
                b++;
            }
        }
        System.out.print(b + " ");

    }
}

//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Выведите в конце количество положительных элементов.
//Ввод:
//8
//-4 9 2 16 -5 8 7 -11
//Вывод:
//5
//
//Ввод:
//10
//1 2 3 4 5 6 7 8 9 10
//Вывод:
//10