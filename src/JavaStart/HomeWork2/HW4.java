package JavaStart.HomeWork2;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if (a>=159 && a<=171) {
            System.out.println("S");
        } else if (a>=172 && a<=177) {
            System.out.println("M");
        } else if (a>=178 && a<=183) {
            System.out.println("L");
        } else if (a>=184 && a<=189) {
            System.out.println("XL");
        } else {
            System.out.println("ERROR");
        }

    }
}

//Создайте программу, которая принимает рост в сантиметрах и поможет пользователю узнать свой размер. Затем выведет результат как в примерах. (S = 159-171, M = 172-177, L = 178-183, XL = 184-189)
//Ввод:
//189
//Вывод:
//XL
//
//Ввод:
//176
//Вывод:
//M