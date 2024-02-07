package JavaStart.Practic;

import java.util.Scanner;

public class Practic13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if (a<=100 || a >=200) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

//Напишите программу, которая будет принимать целое число с консоли. Далее программа должна проверить, если число меньше 100 или больше 200, то выводить YES, иначе NO.
//Ввод:
//17
//Вывод:
//YES
//
//Ввод:
//121
//Вывод:
//NO
