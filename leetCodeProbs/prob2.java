public class prob2 {

    /*
     * Given a signed 32-bit integer x, return x with its digits reversed. If
     * reversing x causes the value to go outside the signed 32-bit integer range
     * [-231, 231 - 1], then return 0.
     * 
     * Assume the environment does not allow you to store 64-bit integers (signed or
     * unsigned).
     * 
     * Example 1:
     * Input: x = 123
     * Output: 321
     * 
     * Example 2:
     * Input: x = -123
     * Output: -321
     * 
     * Example 3:
     * Input: x = 120
     * Output: 21/
     */
    int reverseDigit(int x) {
        int rev = 0;
        while (x != 0) {
            int ld = x % 10;
            x = x / 10;

            //check overflow
            if (rev > Integer.MAX_VALUE) {  
                return 0;
            }

            if (rev < Integer.MIN_VALUE) {
                return 0;
            }

            rev = (rev * 10) + ld; 

        }
        System.out.println(rev);
        return rev;
    }

    public static void main(String[] args) {
        prob2 p2 = new prob2();
        p2.reverseDigit(123);
    }

}
