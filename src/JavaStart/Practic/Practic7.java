package JavaStart.Practic;

import java.util.Scanner;

public class Practic7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if (a>=1 && a<=4) {
            System.out.println("Beginners School");
        } else if (a>=5 && a<=9) {
            System.out.println("Middle School");
        } else if (a>=10 && a<=11) {
            System.out.println("High School");
        } else {
            System.out.println("ERROR");
        }

    }
}

//Напишите программу, где Петя вводит в каком классе он учится, а программа должна определить и выдать результат прописью как показано в примерах ниже. Помните, что с 1 - го по 4 - ый включительно классы - это Beginners School, с 5-го по 9 - ый включительно - это Middle School и c 10 - го по 11 - ый включительно - это High School.
//Ввод:
//2
//Вывод:
//Beginners School
//
//
//Ввод:
//10
//Вывод:
//High School
