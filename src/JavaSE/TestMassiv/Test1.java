package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {6,19,26,9,46,8,5,65,90,25};
        int size = in.nextInt();
        System.out.println(nums[size]);

    }
}

//Из массива int[] nums = {6,19,26,9,46,8,5,65,90,25} выведите на экран число по заданному индексу.
//Ввод:
//2
//Вывод:
//26
//
//Ввод:
//6
//Вывод:
//5