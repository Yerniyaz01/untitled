package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;

        while (i <= n) {
            System.out.print(i + " ");
            i+=2;
        }


    }
}

//Программа запрашивает целое число (int n) и выводит на экран все ЧЕТНЫЕ числа от 0 до n. (Четные – числа которые делятся на 2 без остатка).
//*Подсказка: Можете использовать if для проверки чисел
//Примечание*** Если используете % (оператор остатка) в коде, то пишите их без пробелов. Пример: Вместо (a % b) пишите (a%b), без пробелов
//Ввод:
//6
//Вывод:
//0 2 4 6
//
//Ввод:
//10
//Вывод:
//0 2 4 6 8 10