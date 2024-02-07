package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = n + m;

        System.out.println((double)sum/2);

    }
}

//Программа запрашивает два целых числа (int n и int m) и выводит на экран СРЕДНЕЕ ЗНАЧЕНИЕ всех чисел от n до m. (Среднее значение вычисляется делением суммы на количество чисел)
//Ввод:
//3 10
//Вывод:
//6.5
//
//
//Ввод:
//5 15
//Вывод:
//10.0