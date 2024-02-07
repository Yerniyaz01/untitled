package JavaSE.TestTryCatch;

import java.util.Scanner;

public class TestTryCatch2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 0;
        try{
            m = in.nextInt();
        }catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
        if (m > 0) {
            System.out.println(n/m);
        } else {
            System.out.println("Division by zero");
        }
    }
}
