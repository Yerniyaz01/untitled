package JavaStart.TestString;

import java.util.Scanner;

public class TestString27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte number1 = in.nextByte();
        char text1 = in.next().charAt(0);
        byte number2 = in.nextByte();
        char text2 = in.next().charAt(0);
        byte number3 = in.nextByte();
        int sum = 0;

        if (text1 == '+') {
            if (text2 == '+') {
                sum = number1 + number2 + number3;
            }
            if (text2 == '-') {
                sum = number1 + number2 - number3;
            }
            if (text2 == '*') {
                sum = number1 + (number2 * number3);
            }
            if (text2 == '/') {
                sum = number1 + (number2 / number3);
            }
        }
        if (text1 == '-') {
            if (text2 == '+') {
                sum = number1 - number2 + number3;
            }
            if (text2 == '-') {
                sum = number1 - number2 - number3;
            }
            if (text2 == '*') {
                sum = number1 - (number2 * number3);
            }
            if (text2 == '/') {
                sum = number1 - (number2 / number3);
            }
        }
        if (text1 == '*') {
            if (text2 == '+') {
                sum = number1 * number2 + number3;
            }
            if (text2 == '-') {
                sum = number1 * number2 - number3;
            }
            if (text2 == '*') {
                sum = number1 * number2 * number3;
            }
            if (text2 == '/') {
                sum = number1 * number2 / number3;
            }
        }
        if (text1 == '/') {
            if (text2 == '+') {
                sum = number1 / number2 + number3;
            }
            if (text2 == '-') {
                sum = number1 / number2 - number3;
            }
            if (text2 == '*') {
                sum = number1 / number2 * number3;
            }
            if (text2 == '/') {
                sum = number1 / number2 / number3;
            }
        }
        System.out.println(sum);
    }
}

//Создайте калькулятор который принимает несколько чисел с математическими операторами (+, -, * , /) и выдает результат операции.
//Ввод
//5 * 5 - 4
//Вывод
//21
//
//Ввод
//100 - 50 + 25
//Вывод
//75