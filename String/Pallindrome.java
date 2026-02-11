import java.util.Scanner;

public class Pallindrome {
    //Two poitner technique...
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String to check: ");
        String s = input.nextLine();

        int left = 0;
        int right = s.length() - 1;

        boolean isallindrome = true;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isallindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isallindrome) {
            System.out.println("Its an pallindrome");
        } else {
            System.out.println("Not a pallindrome");
        }

        input.close();
    }
}
