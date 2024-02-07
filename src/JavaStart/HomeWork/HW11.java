package JavaStart.HomeWork;

import java.util.Scanner;

public class HW11 {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        int N = in.nextInt();
        int M = N%60;

        System.out.println(M);

    }
}

//С начала суток прошло N секунд (N - целое). Найти количество секунд, прошедших с начала последней минуты.
//Примечание*** Если используете % (оператор остатка) в коде, то пишите их без пробелов. Пример: Вместо (a % b) пишите (a%b), без пробелов
//Ввод:
//72
//Вывод:
//12
//
//
//Ввод:
//4350
//Вывод:
//30