package JavaStart.HomeWork2;

import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if (a==8 && b==7 ) {
            if (c==0 || c==7) {
                if (d==1 || d==5 || d==7 || d==0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }

    }
}

//Напишите программу, где вводится первые 4 цифры мобильного номера (начиная с 8-ки), определить является ли номер казахстанского оператора (701, 777, 705, 707, 700). Выводить YES, если номер казахстанский, иначе NO.
//Ввод:
//8 7 0 7
//Вывод:
//YES
//
//Ввод:
//8 9 8 7
//Вывод:
//NO
