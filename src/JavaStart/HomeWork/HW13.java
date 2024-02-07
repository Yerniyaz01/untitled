package JavaStart.HomeWork;

import java.util.Scanner;

public class HW13 {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        int S = in.nextInt();
        int a = S/10;
        int b = S%10*10;

        System.out.println(b+a);

    }
}

//Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа.
//Примечание*** Если используете % (оператор остатка) в коде, то пишите их без пробелов. Пример: Вместо (a % b) пишите (a%b), без пробелов
//
//Ввод:
//95
//Вывод:
//59
//
//Ввод:
//71
//Вывод:
//17
