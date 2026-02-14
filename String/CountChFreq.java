import java.util.Scanner;

public class CountChFreq {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s = input.nextLine().toLowerCase();

        int[] freq = new int[26];
        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        //print freq
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char)(i + 'a') + " -> " + freq[i]);
            }
        }

    }
}
