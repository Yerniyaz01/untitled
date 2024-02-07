package JavaStart.Practic;

import java.util.Scanner;

public class Practic11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a%2;

        if (a>0 && b==0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

//Создайте программу, которая выводит в консоль YES, если введенное целое число является положительным и четным, иначе NO.
//Примечание*** Если используете % (оператор остатка) в коде, то пишите их без пробелов. Пример: Вместо (a % b) пишите (a%b), без пробелов
//Ввод:
//12
//Вывод:
//YES
//
//Ввод:
//-5
//Вывод:
//NO
