package JavaSE.TestTryCatch;

import java.util.Scanner;
import java.util.InputMismatchException;
public class TestTryCatch1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < nums.length ; i++) {
            try {
                nums[i] = in.nextInt();
            }catch (InputMismatchException e){
                in.next();
                nums[i] = 0;
            }
        }

        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i]*nums[i] + " ");
        }
    }
}
