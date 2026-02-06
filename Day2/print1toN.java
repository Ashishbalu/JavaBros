package Day2;

import java.util.Scanner;

public class print1toN {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter the value of n: ");
        // int n = input.nextInt();
        int n = 100;
        int i;
        for (i = 1; i <= n; i++) {
            if (i>n) {
                return;
            }
            System.out.println(i);
        }
    }
}
