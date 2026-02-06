package Day2;

import java.util.Scanner;

public class SumNNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfN(3));



        /*
         * Scanner input = new Scanner(System.in);
         * System.out.println("enter the value of n: ");
         * int n = input.nextInt();
         * int sum = 0;
         * for (int i = 0; i <=n; i++) {
         * sum += i;
         * }
         * System.out.println(sum);
         */

        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Enter the positive number");
            input.close();
        }
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("The sum of first " + n + " number is: " + sum);
        input.close();
        */
    }

    static int sumOfN(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
