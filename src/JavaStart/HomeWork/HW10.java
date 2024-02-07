package JavaStart.HomeWork;

import java.util.Scanner;

public class HW10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = N/60;

        System.out.println(M);

    }
}

//С начала суток прошло N секунд (N - целое). Найти количество полных минут, прошедших с начала суток.
//Ввод:
//60
//Вывод:
//1
//
//
//Ввод:
//365
//Вывод:
//6