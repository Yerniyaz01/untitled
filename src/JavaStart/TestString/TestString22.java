package JavaStart.TestString;

import java.util.Scanner;

public class TestString22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        char[] symbol = text.toCharArray();

        for (int i = 0; i < symbol.length; i++) {
            char c = symbol[i];
            if (Character.isDigit(c)) symbol[i] = '0';
        }
        System.out.println(new String(symbol));

    }
}

//Программа должна приравнять все цифры в тексте к значению 0.
//Ввод
//Bit2015Lab
//Вывод
//Bit0000Lab
//
//Ввод
//05EAZ468
//Вывод
//00EAZ000