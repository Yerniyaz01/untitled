package JavaStart.TestString;

import java.util.Scanner;

public class TestString23 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        char[] symbol = text.toCharArray();
        int a = 0;

        for (int i = 0; i < symbol.length; i++) {
            char c = symbol[i];
            if (Character.isAlphabetic(c)) a++;
        }
        System.out.println(a);

    }
}

//Сделайте счетчик который считает количество букв в тексте исключая цифры и символы.
//Ввод
//_sniper90 _
//Вывод
//6
//
//Ввод
//String [] words = new String[30];
//Вывод
//20
