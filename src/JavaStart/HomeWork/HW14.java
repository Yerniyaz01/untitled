package JavaStart.HomeWork;

import java.util.Scanner;

public class HW14 {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        int S = in.nextInt();
        int a = S*5000;
        int P = a/100*5;

        System.out.println(P);

    }
}

//Помогите бухгалтеру Армана рассчитать премию за продажи товаров. Сколько должен выдать бухгалтер, если премия составляет 5% от всей суммы продаж, а каждый товар стоит 5000 тенге. В консоль задается количество проданных Арманом товаров
//Ввод:
//35
//Вывод:
//8750
//
//Ввод:
//144
//Вывод:
//36000