package Project;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] arr = new Integer[10];
        int sum = 0;
        float count = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }

        System.out.println("1. Выводит на экран все элементы массива в обратном порядке.");
        System.out.println("2. Находит сумму всех элементов массива и выводит ее на экран.");
        System.out.println("3. Находит среднее арифметическое всех элементов массива и выводит его на экран.");
        System.out.println("4. Находит наименьший элемент массива и выводит его на экран.");
        System.out.println("5. Находит наибольший элемент массива и выводит его на экран.");
        System.out.println("6. Сортирует массив по возрастанию и выводит его значения на экран.");
        System.out.println("7. Сортирует массив по убыванию и выводитего значения на экран.");
        System.out.println("8. Выход из программы");
        System.out.println("------------------------------------------------------------");

        for (int b = in.nextInt(); b != 8; b = in.nextInt()) {
            switch (b) {
                case 1 -> {
                    for (int i = 9; i >= 0; i--) {
                        System.out.println(i + " - " + arr[i]);
                    }
                    System.out.println("------------------------------------------------------------");
                    break;
                }
                case 2 -> {
                    sum = 0;
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println(i + " - " + arr[i]);
                        sum = sum + arr[i];
                    }
                    System.out.println("Общая сумма - " + sum);
                    System.out.println("------------------------------------------------------------");
                    break;
                }
                case 3 -> {
                    sum = 0;
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println(i + " - " + arr[i]);
                        sum = sum + arr[i];
                        count = sum / (float) arr.length;
                    }
                    System.out.println("Арифметическая середина - " + count);
                    System.out.println("------------------------------------------------------------");
                    break;
                }
                case 4 -> {
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println(i + " - " + arr[i]);
                        if (min > arr[i]) {
                            min = arr[i];
                        }
                    }
                    System.out.println("Минимальное число - " + min);
                    System.out.println("------------------------------------------------------------");
                    break;
                }
                case 5 -> {
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println(i + " - " + arr[i]);
                        if (max < arr[i]) {
                            max = arr[i];
                        }
                    }
                    System.out.println("Максимальное число - " + max);
                    System.out.println("------------------------------------------------------------");
                    break;
                }
                case 6 -> {
                    Arrays.sort(arr);
                    for (int values : arr) {
                        System.out.println(values);
                    }
                    System.out.println("По возрастания ");
                    System.out.println("------------------------------------------------------------");
                    break;
                }
                case 7 -> {
                    Arrays.sort(arr, Collections.reverseOrder());
                    for (int values : arr) {
                        System.out.println(values);
                    }
                    System.out.println("По убыванию ");
                    System.out.println("------------------------------------------------------------");
                    break;
                }
            }
        }
    }
}