package JavaStart.Practic;

import java.util.Scanner;

public class Practic3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if (a==1) {
            System.out.println("ONE");
        }else if (a==2) {
            System.out.println("TWO");
        }else if (a==3) {
            System.out.println("THREE");
        }else if (a==4) {
            System.out.println("FOUR");
        }else if (a==5) {
            System.out.println("FIVE");
        }else if (a==6) {
            System.out.println("SIX");
        }else if (a==7) {
            System.out.println("SEVEN");
        }else if (a==8) {
            System.out.println("EIGHT");
        }else if (a==9) {
            System.out.println("NINE");
        }else {
            System.out.println("ERROR");
        }

    }
}

//Создайте программу, которая принимает c консоли цифру от 1 до 9 включительно, далее программа должна вывести ONE - если ввели 1, TWO - если ввели 2, THREE - если ввели 3 … и.т.д.
//Ввод:
//3
//Вывод:
//THREE
//
//Ввод:
//5
//Вывод:
//FIVE