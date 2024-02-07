package JavaStart.TestString;

import java.util.Scanner;

public class TestString10 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print(text.charAt(i));
            }
            System.out.print(text.charAt(i));
        }

    }
}

//Напишите программу, которая продублирует все символы введенного текста.
//Ввод
//Bitlab
//Вывод
//BBiittllaabb
//
//Ввод
//JAVA
//Вывод
//JJAAVVAA
