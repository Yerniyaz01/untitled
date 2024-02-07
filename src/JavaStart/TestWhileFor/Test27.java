package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double b = 2;
        double a = 1;

        while (b<=n) {
            a = a + 1/b;
            b++;
        }
        System.out.println(a);

    }
}

//Программа запрашивает число n. Программа должна вывести сумму первых n чисел в последовательности 1+1/2+1/3+1/4...
//Ввод:
//3
//Вывод:
//1.83333
//
//Ввод:
//15
//Вывод:
//3.31823