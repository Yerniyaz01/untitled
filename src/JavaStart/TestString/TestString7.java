package JavaStart.TestString;

import java.util.Scanner;

public class TestString7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        text = text.trim();
        System.out.println("(" + text + ")");

    }
}

//Программа должна запрашивать текст. Если этот текст содержит пробелы в начале и в конце, уберите их и оберните ваш текст в скобки.
//Ввод
//  spaces
//Вывод
//(spaces)
//
//Ввод
//  Just my universe
//Вывод
//(Just my universe)
