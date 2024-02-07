package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        int sum = 0;
        double count = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int a = 0; a < nums.length; a++) {
            sum = sum + nums[a];
        }
        count = sum / (double)nums.length;
        System.out.print(sum + " " + count);


    }
}

//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Программа должна вывести сумму и среднее значение введенных чисел.
//Ввод:
//3
//4 9 2
//Вывод:
//15 5.0
//
//Ввод:
//10
//1 2 3 4 5 6 7 8 9 10
//Вывод:
//55 5.5
