public class PairWithSum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 5, 3, 5 };
        int target = 9;

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
    }
}

//can be optimized using hashSet