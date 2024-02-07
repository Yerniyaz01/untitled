package JavaStart.Practic;

import java.util.Scanner;

public class Practic5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a%2;

        if (b == 0) {
            System.out.println("EVEN");
        }else {
            System.out.println("ODD");
        }

    }
}

//Напишите программу, где ввожу целое число n, и если оно четное, программа выведет EVEN иначе ODD.
//Примечание*** Если используете % (оператор остатка) в коде, то пишите их без пробелов. Пример: Вместо (a % b) пишите (a%b), без пробелов
//Ввод:
//8
//Вывод:
//EVEN
//
//Ввод:
//7
//Вывод:
//ODD