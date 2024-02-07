package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int count = 0;

        while (n <= m) {
            if (n%2==0){
                count++;
            }
            n++;
        }
        System.out.println(count);


    }
}

//Программа должна запрашивать два целых числа (int n и int m) и показать количество ЧЕТНЫХ чисел в промежутке от n до m.
//*Подсказка: создайте дополнительную переменную int count = 0 которая увеличиваться на 1 если число будет ЧЕТНЫМ
//Примечание*** Если используете % (оператор остатка) в коде, то пишите их без пробелов. Пример: Вместо (a % b) пишите (a%b), без пробелов
//Ввод:
//1 5
//Вывод:
//2
//
//Ввод:
//5 10
//Вывод:
//3