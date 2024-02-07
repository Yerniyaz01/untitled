package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double d;
        double f = 1;

        while (true) {
            d = in.nextDouble();
            if (d == 0){
                break;
            }
            f = f * d;
        }
        System.out.println((float)f);


    }
}

//Напишите программу, которая запрашивает дробные числа (double d). Программа должна остановиться запрашивать, когда мы вводим 0. Программа должна вывести умножение всех введенных чисел.
//Примечание** Тип данных вывода float
//Ввод:
//3.1 2.4 1.2 0
//Вывод:
//8.928
//
//Ввод:
//5.2 -2.3 0
//Вывод:
//-11.96