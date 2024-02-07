package JavaSE.TestTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTryCatch6 {
    public static void main(String[] args) {
        Scanner in;
        int a = 0;
        int b = 0;
        int check = 0;

        while (check == 0) {
            try {
                in = new Scanner(System.in);
                check++;
                a = in.nextInt();
                b = in.nextInt();
                System.out.println("Sum of numbers: " + (a + b));
            } catch (InputMismatchException e) {
                check--;
                System.out.println("Error: Invalid data entered. Try again");
            }
        }

    }
}
