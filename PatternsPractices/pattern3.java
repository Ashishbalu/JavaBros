package PatternsPractices;


public class pattern3 {
    // int number;

    void print1(int n){
         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern3 p1 = new pattern3();
        p1.print1(5);
        p1.print1(3);
    }
}
