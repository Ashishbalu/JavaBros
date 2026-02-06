public class SecondLargestNumber {
    static int secondLarge(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > max) {
                secondMax = max;
                max = x;
            } else if (x > secondMax && x < max) {
                secondMax = x;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 8, 5, 15, 20 };

        System.out.println(secondLarge(arr));
    }
}
