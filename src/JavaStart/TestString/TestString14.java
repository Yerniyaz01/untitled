package JavaStart.TestString;

import java.util.Scanner;

public class TestString14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        int index = s1.indexOf(s2);

        if (index>=0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

//Вводим в программу две строки s1 и s2. Если s2 содержится внутри слова s1, то программа выводит "Yes", иначе "No".
//Ввод
//universe
//ivery
//Вывод
//No
//
//Ввод
//macbookair
//book
//Вывод
//Yes