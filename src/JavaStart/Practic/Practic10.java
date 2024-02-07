package JavaStart.Practic;

import java.util.Scanner;

public class Practic10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a==b && b==c && a==c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

//Напишите программу, где я ввожу три числа. Если все числа одинаковые, то выведите YES, иначе NO.
//Ввод:
//15
//15
//15
//Вывод:
//YES
//
//Ввод:
//12
//37
//20
//Вывод:
//NO