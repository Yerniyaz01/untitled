package JavaStart.TestString;

import java.util.Scanner;

public class TestString28 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String[] symbol = text.split(" ");
        char[] nums = new char[symbol.length];

        for (int i = 0; i < symbol.length; i++) {
            nums = symbol[i].toCharArray();
            for (int j = nums.length-1; j >= 0; j--) {
                System.out.print(nums[j]);
            }
            System.out.print(" ");
        }


    }
}

//Напишите программу которая прописывает каждое слово в тексте в обратном порядке.
//Ввод
//Bitlab Academy
//Вывод
//baltiB ymedacA
//
//Ввод
//Java programming language
//Вывод
//avaJ gnimmargorp egaugnal
