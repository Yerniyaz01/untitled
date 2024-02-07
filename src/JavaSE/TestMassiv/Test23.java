package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        float count = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (max < nums[i]) max = nums[i];
            if (min > nums[i]) min = nums[i];
            count++;
        }
        sum = sum - (max + min);
        count = (float)sum / (count-2);
        System.out.println(sum);
        System.out.println(count);

    }
}

//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Программа должна вывести сумму и среднее значение исключая максимальное и минимальное значение.
//Примечание** Eсли максимальное или минимальное число несколько то берем только одну из них
//Ввод:
//10
//6 19 26 9 46 8 5 65 90 25
//Вывод:
//204
//25.5
//
//Ввод:
//10
//1 2 3 4 5 6 7 8 9 10
//Вывод:
//44
//5.5