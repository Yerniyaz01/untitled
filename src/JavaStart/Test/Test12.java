package JavaStart.Test;

public class Test12 {
    public static void main(String[] args) {
        double dollar = 14940;
        double nds = 12;

        System.out.print("Tax is ");
        System.out.print(nds * dollar / 100);
        System.out.print(" dollars");
    }
}

//Компания "BITLAB" заработала 14940 долларов на продаже курсов. Программа должна вычислить сумму НДС в 12% от заработка.
//Вывод:
//Tax is 1792.8 dollars