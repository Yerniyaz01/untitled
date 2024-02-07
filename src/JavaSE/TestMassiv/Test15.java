package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] nums = new int [n];
        int sum = 1;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0) {
                sum = sum * nums[i];
            }
        }
        System.out.println(sum);

    }
}

//Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Программа должна вывести умножение элементов не равных нулю.
//Ввод:
//6
//0 2 4 0 3 1
//Вывод:
//24
//
//Ввод:
//10
//1 0 3 4 0 6 0 8 0 10
//Вывод:
//5760
