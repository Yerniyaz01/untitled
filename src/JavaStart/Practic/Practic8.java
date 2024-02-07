package JavaStart.Practic;

import java.util.Scanner;

public class Practic8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if (a<=2019) {
            System.out.println("NO");
        } else if (a==2020) {
            System.out.println("ERROR");
        } else if (a>=2021) {
            System.out.println("YES");
        } else {

        }

    }
}

//Дано число. Если оно меньше или равно 2019, то вывести NO, если больше или равно 2021, то вывести YES, если равно 2020, то вывести ERROR.
//Ввод:
//2018
//Вывод:
//NO
//
//Ввод:
//2020
//Вывод:
//ERROR
