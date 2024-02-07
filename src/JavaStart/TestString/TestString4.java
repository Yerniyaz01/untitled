package JavaStart.TestString;

import java.util.Scanner;

public class TestString4 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String text = "java";
        String text1 = in.next();

        text = text.toLowerCase();
        text1 = text1.toLowerCase();

        if (text.equals(text1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}

//Напишите программу которая принимает текст и сравнивает его со словом "java". Если они равны без учета регистров (заглавные и строчные буквы) выведите "YES", иначе "NO".
//Ввод
//JaVa
//Вывод
//YES
//
//Ввод
//Javacourse
//Вывод
//NO
