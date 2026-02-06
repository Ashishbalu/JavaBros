package PatternsPractices;

public class pattern12 {
    public static void main(String[] args) {
        int n = 5;
        int space = 0;
        for (int i = 0; i < n; i++) {
            //Stars
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("*");
            }
            //Spaces
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            space += 2;
            System.out.println();
        }
         space = 2*n-2;
          for (int i = 1; i<=n; i++) {
            //Stars
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            //Spaces
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            space -= 2;
            System.out.println();
        }
    }
}
