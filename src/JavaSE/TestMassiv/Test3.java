package JavaSE.TestMassiv;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int a = 0; a < nums.length; a++) {
            System.out.println(a + " - " + nums[a]);
        }


    }
}

//Создайте массив из целых чисел и с помощью цикла выведите все элементы вместе с индексами.
//Ввод:
//5
//1 2 3 4 5
//Вывод:
//0 - 1
//1 - 2
//2 - 3
//3 - 4
//4 - 5
//
//Ввод:
//10
//4 67 9 12 6 45 11 7 23 40
//Вывод:
//0 - 4
//1 - 67
//2 - 9
//3 - 12
//4 - 6
//5 - 45
//6 - 11
//7 - 7
//8 - 23
//9 - 40