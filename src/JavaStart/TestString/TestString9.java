package JavaStart.TestString;

import java.util.Scanner;

public class TestString9 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        text = text.trim();

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.substring(i,i+1));
        }

    }
}

//Напишите программу которая принимает слово и выводит каждый символ этого слова в отдельной строке.
//Ввод
//Hello
//Вывод
//H
//e
//l
//l
//o
//
//Ввод
//Enter
//Вывод
//E
//n
//t
//e
//r
