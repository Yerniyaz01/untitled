package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;

        while (i<10) {
            i++;
            System.out.print(n + " ");
        }


    }
}

//Напишите программу которая будет принимать с консоли целостное число (int n) и выведет это число 10 (десять) раз.
//*Подсказка: Для вывода чисел на одной строке можно использовать System.out.print() вместо System.out.println()
//Ввод:
//5
//Вывод:
//5 5 5 5 5 5 5 5 5 5
//
//Ввод:
//9
//Вывод:
//9 9 9 9 9 9 9 9 9 9
