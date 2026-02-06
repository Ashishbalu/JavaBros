public class SubstringPalindrome {
    public static void main(String[] args) {
        String s1 = "babad";
        String sb = s1.substring(0, 3);
        String dup;
        dup = sb;
        int start = 0;
        int end = sb.length() - 1;
        while (start < end) {
            if (sb.charAt(start) != sb.charAt(end)) {
                start++;
                end--;
            }
        }
        System.out.println(sb);
    }
}
