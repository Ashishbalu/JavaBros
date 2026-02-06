package Recursion;
import java.util.Scanner;

public class print1toN {
    void print(int i, int n){
        if (i>n) {
            return;
        }
        System.out.println(i);
        print(i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        print1toN n1 = new print1toN();
        n1.print(1, n);
        sc.close();
    }
}
