package JavaStart.HomeWork;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int r = (x*x*x)+(5*x*y)-(6*z*y)+(z*z*z);
        System.out.println(r);

    }
}

//Создайте программу, которая высчитывает результат математической формулы x^3 + 5xy - 6zy + z^3 и выведете результат в консоль как на примере ниже. Данные по переменным: x, y, z, будут вводиться через консоль.
//Ввод:
//1 2 3
//Вывод:
//2
//
//Ввод:
//3 3 8
//Вывод:
//440