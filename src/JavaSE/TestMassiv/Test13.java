package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        float sum = 0;
        float b = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int a = 0; a < nums.length; a++) {
            if (nums[a]<0) {
                sum = sum + (float)nums[a];
                b++;
            }
        }
        System.out.println(sum/b);



    }
}

//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Выведите в конце среднее арифметическое отрицательных элементов массива.
//Примечание** Тип данных вывода float
//Ввод:
//8
//-4 9 2 -10 8 7 -17 16
//Вывод:
//-10.333333
//
//Ввод:
//10
//6 19 -26 3 -46 8 5 -65 -90 25
//Вывод:
//-56.75
