public class FindMinMax {

    static void findMinMax(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Your min element is: " + min);
        System.out.println("Your max element is: " + max);

    }

    public static void main(String[] args) {
        int[] arr = { 3, 8, 9, 6 };
        findMinMax(arr, arr.length);

    }
}
