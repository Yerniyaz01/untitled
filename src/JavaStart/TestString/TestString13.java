package JavaStart.TestString;

import java.util.Scanner;

public class TestString13 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        StringBuilder text1 = new StringBuilder(text);
        text1.reverse();
        String reversedText = text1.toString();
        System.out.println(text1);

    }
}

//Напишите программу которая показывает принятый текст в обратном порядке.
//Ввод
//Hello
//Вывод
//olleH
//
//Ввод
//Zinedine
//Вывод
//enideniZ