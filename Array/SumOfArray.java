public class SumOfArray {
    int sumArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        SumOfArray s1 = new SumOfArray();
        int result = s1.sumArray(arr);
        System.out.println("The sum of Array is: " + result);
    }
}
