import java.lang.Thread.State;

public class ReverseArray2 {

    static void rev(int[] arr){
        int left = 0;
        int right = arr.length -1;
        while (left<right) {
            int temp;
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        rev(arr);
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
    
}
