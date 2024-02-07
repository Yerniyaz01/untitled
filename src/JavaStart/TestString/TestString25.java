package JavaStart.TestString;

import java.util.Scanner;

public class TestString25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        char[] symbol = text.toCharArray();
        boolean count = false;

        for (int i = 0; i < symbol.length; i++) {
            char c = symbol[i];
            if (c == '<') {
                count = true;
                i= i+2;
            }
            else if (c == '>') {
                count = false;
            }
            if (count == true) System.out.print(symbol[i]);
        }

    }
}

//Программа должна принимать текст и показывать на экране только те слова которые находятся между символами < и >.
//Ввод
//Hello, this is < BITLAB > academy
//Вывод
//BITLAB
//
//Ввод
//Strings in < Java > are < Objects > that are backed < internally > by a < char > array
//Вывод
//Java Objects internally сhar
