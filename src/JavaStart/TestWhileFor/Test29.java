package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;

        while (b<=n) {
            a = a + (b*b);
            b++;
        }
        System.out.println(a);


    }
}

//По данному натуральному n вычислите сумму 1^2+2^2+...+n^2.
//Ввод:
//2
//Вывод:
//5
//
//Ввод:
//5
//Вывод:
//55