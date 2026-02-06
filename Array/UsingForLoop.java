public class UsingForLoop {
    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 15};

        /*  Using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

            // using for each loop
            for (int i : arr) {
                System.out.println(i);
            }

    }
}
