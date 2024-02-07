package JavaStart.TestString;

import java.util.Scanner;

public class TestString6 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        char symbol = in.next().charAt(0);
        int index = text.indexOf(symbol);

        if (index >=0) {
            System.out.println(index);
        } else {
            System.out.println("THERE IS NO SUCH LETTER");
        }


    }
}

//Напишите программу которая принимает одно слово и одну букву. Выведите индекс буквы в слове если она там присутствует, и "THERE IS NO SUCH LETTER" если в слове буквы не окажется.
//Ввод
//Kazakhstan
//s
//Вывод
//6
//
//Ввод
//Almaty
//b
//Вывод
//THERE IS NO SUCH LETTER
