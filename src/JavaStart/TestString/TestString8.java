package JavaStart.TestString;

import java.util.Scanner;

public class TestString8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        text = text.toLowerCase();
        text = text.trim();

        if (text.equals(number[0])) {
            System.out.println(0);
        } else if (text.equals(number[1])) {
            System.out.println(1);
        } else if (text.equals(number[2])) {
            System.out.println(2);
        } else if (text.equals(number[3])) {
            System.out.println(3);
        } else if (text.equals(number[4])) {
            System.out.println(4);
        } else if (text.equals(number[5])) {
            System.out.println(5);
        } else if (text.equals(number[6])) {
            System.out.println(6);
        } else if (text.equals(number[7])) {
            System.out.println(7);
        } else if (text.equals(number[8])) {
            System.out.println(8);
        } else if (text.equals(number[9])) {
            System.out.println(9);
        }


    }
}

//Напишите программу которая принимает число(В интервале от 0 до 9) в текством формате и показывает на экране в виде цифры.
//Ввод
//one
//Вывод
//1
//
//Ввод
//seven
//Вывод
//7
