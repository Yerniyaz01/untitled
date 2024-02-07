package JavaStart.Test;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String companyName = in.next();
        int profit = in.nextInt();
        double month = in.nextDouble();
        double promon = profit / month;

        System.out.println("Company " + companyName + " earns " + promon + " dollars in a month");
    }
}

//Напишите программу, которая принимает данные о компании (String companyName, int profit, double month) и выведет в консоль наименование компании и средний доход в месяц.
//Ввод:
//P&G
//145900
//8
//
//Вывод:
//Company P&G earns 18237.5 dollars in a month
//
//
//Ввод:
//AirAstana
//142854
//5.8
//
//Вывод:
//Company AirAstana earns 24630.0 dollars in a month