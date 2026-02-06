public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {20, 15, 10, 5};
        int left = 0;
        int right = arr.length-1;

        while (left<right) {
            int temp;
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
