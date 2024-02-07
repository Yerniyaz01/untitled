package JavaStart.TestString;

import java.util.Scanner;

public class TestString11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        text = text.toLowerCase();
        char symbol = in.next().charAt(0);
        int count = text.length() - text.replace(String.valueOf(symbol), "").length();
        System.out.println(count);

    }
}

//Программа должна принимать текст и букву, затем подсчитать сколько раз буква встречается в тексте.
//Ввод
//Bobby
//b
//Вывод
//3
//
//Ввод
//Avadakedavra
//a
//Вывод
//5
