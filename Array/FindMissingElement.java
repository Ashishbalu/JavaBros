public class FindMissingElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = arr.length + 1;
        int arraySum = n*(n+1)/2;
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        int missing = arraySum - totalSum;
        System.out.println(missing);

    }
}
