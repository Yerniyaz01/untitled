package JavaStart.TestString;

import java.util.Scanner;

public class TestString26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        text = text.toLowerCase();

        text = text.replace("zero", "0");
        text = text.replace("one", "1");
        text = text.replace("two", "2");
        text = text.replace("three", "3");
        text = text.replace("four", "4");
        text = text.replace("five", "5");
        text = text.replace("six", "6");
        text = text.replace("seven", "7");
        text = text.replace("eight", "8");
        text = text.replace("nine", "9");

        System.out.println(text);

    }
}

//Напишите программу которая заменяет цифры прописанные в текстовом виде на числовой формат.
//Ввод
//One + two = three
//Вывод
//1 + 2 = 3
//
//Ввод
//Eight bits is equal to one byte.
//Вывод
//8 bits is equal to 1 byte.
