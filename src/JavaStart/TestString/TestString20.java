package JavaStart.TestString;

import java.util.Scanner;

public class TestString20 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        byte nums = in.nextByte();
        char symbol = in.next().charAt(0);
        byte nums2 = in.nextByte();

        if (symbol=='+') System.out.println(nums + nums2);
        else if (symbol=='-') System.out.println(nums - nums2);
        else if (symbol=='*') System.out.println(nums * nums2);
        else if (symbol=='/') System.out.println(nums / nums2);
        else System.out.println("ERROR");

    }
}

//Сделайте некое подобие калькулятора который принимает два числа и оператор(+, -, * , /) между ними в виде текста. Выведите на экран результат операции.
//Ввод
//1 + 5
//Вывод
//6
//
//Ввод
//5 * 10
//Вывод
//50