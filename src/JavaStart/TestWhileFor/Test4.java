package JavaStart.TestWhileFor;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int n = in.nextInt();
        int i = 0;

        while (i<n) {
            i++;
            System.out.println(S);
        }


    }
}

//Программа должна запрашивать с консоли любой текст (String S) и число (int n) и выводить на экране это слово n раз.
//Ввод:
//Bitlab
//5
//Вывод:
//Bitlab
//Bitlab
//Bitlab
//Bitlab
//Bitlab
//
//Ввод:
//Academy
//8
//Вывод:
//Academy
//Academy
//Academy
//Academy
//Academy
//Academy
//Academy
//Academy
