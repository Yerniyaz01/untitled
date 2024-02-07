package JavaStart.TestString;

import java.util.Scanner;

public class TestString5 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        String text1 = in.next();

        text = text.toLowerCase();
        text1 = text1.toLowerCase();

        if (text.equals(text1)) {
            System.out.println("THEY ARE EQUAL");
        } else {
            System.out.println("THEY ARE NOT EQUAL");
        }


    }
}

//Программа запрашивает два слова и сравнивает их без учета регистров (заглавные и строчные буквы). Выведите на экран "THEY ARE EQUAL" если оны равны, и "THEY ARE NOT EQUAL" в противном случае.
//Ввод
//Programming
//PROGRAMMING
//Вывод
//THEY ARE EQUAL
//
//Ввод
//JAVA
//COURSE
//Вывод
//THEY ARE NOT EQUAL
