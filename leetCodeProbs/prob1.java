public class prob1 {
    // Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

    int addTwo(int num){
        while (num>=10) {
            int sum = 0;

            while (num>0) {
                sum += num%10;
                num = num/10;
            }
            num = sum;
        }
        System.out.println(num);
        return num;
    }

    public static void main(String[] args) {
        prob1 p1 = new prob1();
        p1.addTwo(38);
    }
}
