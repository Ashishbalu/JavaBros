package Recursion;

import java.util.Scanner;

public class printNamesNTimes {
    void print(int i, int n){
        if (i>n) {
            return;
        }
        System.out.println("Ashish");
        print(i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();
        printNamesNTimes n1 = new printNamesNTimes();
        n1.print(1, n);
        sc.close();
    }
}
