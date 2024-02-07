package JavaStart.TestString;

import java.util.Scanner;

public class TestString24 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        text = text.trim();
        char[] symbol = text.toCharArray();

        for (int i = 0; i < symbol.length; i++) {
            char c = symbol[i];
            symbol[0] = Character.toUpperCase(symbol[0]);
            if (c == ' ') {
                i++;
                symbol[i] = Character.toUpperCase(symbol[i]);
            }
        }
        System.out.println(new String(symbol));

    }
}

//Напишите программу которая переписывает текст так чтобы каждое слово начиналось с заглавной буквы.
//Ввод
//zinedine zidane
//Вывод
//Zinedine Zidane
//
//Ввод
//real madrid football club
//Вывод
//Real Madrid Football Club