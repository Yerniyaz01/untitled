package JavaStart.TestString;

import java.util.Scanner;

public class TestString16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        text = text.trim();
        text = text.toLowerCase();
        char[] symbol = text.toCharArray();
        int value = 0;
        int sum = 0;

        for (int i = 0; i < symbol.length; i++) {
            if (symbol[i] >= '0' && symbol[i] <= '9') {
                value = symbol[i] - '0'; //Преобразуем символ в число
                sum = sum + value;
            }
            value = 0;
        }
        System.out.println(sum);

    }
}

//Напишите программу которая выводит сумму всех цифр в тексте.
//Ввод
//2Java5Course
//Вывод
//7
//
//Ввод
//BMW530i
//Вывод
//8
