package JavaStart.Test;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String country = in.next();
        String city = in.next();

        System.out.println("Country: " + country);
        System.out.println("City: " + city);
    }
}

//Напишите программ в которой вводится название любой страны (String country) и название любого города (String city). Далее выведите на экран введенные данные как в примере.
//Ввод:
//Kazakhstan
//Astana
//
//Вывод:
//Country: Kazakhstan
//City: Astana