public class MaxElement {

    static int findMax(int[] arr){
        int max = arr[0];           // Assume first element as max element.
        for (int i = 1; i < arr.length; i++) { // travese
           if (arr[i] > max) {                 // compare
            max = arr[i];                      // update
           }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {3, 8, 9, 6};
        MaxElement m1 = new MaxElement();
        int result = m1.findMax(arr);
        System.out.println("The max element of Array is: " + result);
    }
}
