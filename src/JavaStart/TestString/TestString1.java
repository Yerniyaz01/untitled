package JavaStart.TestString;

import java.util.Scanner;

public class TestString1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        int a = 0;
        for (int i = 0; i < text.length(); i++) {
            a++;
        }
        System.out.print(a);

    }
}

//Напишите программу которая принимает текст и выводит длину(количество символов) текста на экран.
//Ввод
//Hello
//Вывод
//5
//
//Ввод
//Bitlabacademy
//Вывод
//13
