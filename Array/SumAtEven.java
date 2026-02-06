import java.util.Scanner;

public class SumAtEven {

    static int SumIndices(int[] arr, int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the size of array: ");
       int n = input.nextInt();

       int[] arr = new int[n];
       System.out.println("Enter the array:");
       for (int i = 0; i < n; i++) {
        arr[i] = input.nextInt();
       }

       int result = SumIndices(arr, n);
       System.out.println("THe sum is: " + result);


    }
}
