package Recursion;

import java.util.Scanner;

public class printWithBackTrack {
    void print(int i, int n){
        if (i<1) {
            return;
        }
        print(i-1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        printWithBackTrack b1 = new printWithBackTrack();
        b1.print(n, n);
        sc.close();
    }
}
