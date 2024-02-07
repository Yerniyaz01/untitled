package JavaStart.HomeWork;

import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double L = in.nextDouble();
        double Pi = 3.14;
        double R = L/(2*Pi);
        double S = Pi*R;

        System.out.println(R + " " + S);

    }
}

//Создайте программу, которая рассчитает радиус (R) и площадь (S) круга и выводит результат, получив данные длины окружности (L) с консоли. В качестве значения π использовать 3.14.
//*Подсказка: L = 2·π·R;  S = π·R
//Ввод:
//14
//Вывод:
//2.229299363057325 7.0
//
//Ввод:
//20
//Вывод
//3.184713375796178 10.0
