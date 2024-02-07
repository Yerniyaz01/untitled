package JavaStart.Practic;

import java.util.Scanner;

public class Practic1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a%2;

        if (b==0){
            System.out.println("POSITIVE");
        }

    }
}

//Создайте программу, которая принимает с консоли целое число или цифру, а затем выводит POSITIVE если введенное значение положительное. При отрицательном значении ничего выводить не нужно.
//Ввод:
//8
//Вывод:
//POSITIVE
//
//Ввод:
//-7
//Вывод: