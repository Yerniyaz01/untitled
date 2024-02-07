package JavaStart.HomeWork;

import java.util.Scanner;

public class HW12 {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        int S = in.nextInt();
        int a = S/10;
        int b = S%10;

        System.out.println(a);
        System.out.println(b);

    }
}

//Дано двузначное число. Вывести вначале его левую цифру (десятки), а затем - его правую цифру (единицы). Для нахождения десятков использовать операцию деления нацело, для нахождения единиц - операцию взятия остатка от деления.
//Примечание*** Если используете % (оператор остатка) в коде, то пишите их без пробелов. Пример: Вместо (a % b) пишите (a%b), без пробелов
//Ввод:
//41
//Вывод:
//4
//1
//
//Ввод:
//95
//Вывод:
//9
//5