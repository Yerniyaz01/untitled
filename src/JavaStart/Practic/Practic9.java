package JavaStart.Practic;

import java.util.Scanner;

public class Practic9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if (a==1) {
            System.out.println("January");
        } else if (a==2) {
            System.out.println("February");
        } else if (a==3) {
            System.out.println("March");
        } else if (a==4) {
            System.out.println("April");
        } else if (a==5) {
            System.out.println("May");
        } else if (a==6) {
            System.out.println("June");
        } else if (a==7) {
            System.out.println("Jule");
        } else if (a==8) {
            System.out.println("August");
        } else if (a==9) {
            System.out.println("September");
        } else if (a==10) {
            System.out.println("October");
        } else if (a==11) {
            System.out.println("November");
        } else if (a==12) {
            System.out.println("December");
        } else {
            System.out.println("Wrong Input");
        }

    }
}

//Создайте программу, которая поможет Арсену быстро выучить названия 12-ти месяцев на английском (January, February, March, April, May, June, July, August, September, October, November, December). Арсен будет вводит порядковый номер того или иного месяца в консоль, а далее программу будет выводить наименование с заглавной буквы как в примерах ниже, но а если такого месяца не существует, то выводит Wrong Input
//Ввод:
//1
//Вывод:
//January
//
//Ввод:
//71
//Вывод:
//Wrong Input
