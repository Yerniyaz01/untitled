package Project;

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер Массива - ");
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("---------------------------------");
        System.out.print("Введите элементы Массива - ");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        System.out.println("---------------------------------");
        System.out.print("Введите число для нахождения пар - ");

        int a = in.nextInt();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i]!=nums[j]) {
                    if (a == nums[i] + nums[j]) {
                        System.out.println(nums[i] + " + " + nums[j] + " = " + a);
                    }
                }
            }
        }

    }
}
