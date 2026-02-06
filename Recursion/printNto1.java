package Recursion;

import java.util.Scanner;

public class printNto1 {
    void print(int i, int n){
        if (i<1) {
            return;
        }
        System.out.println(i);
        print(i-1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        printNto1 n1 = new printNto1();
        n1.print(n, n);
        sc.close();
    }
}
