package PatternsPractices;

public class pattern10 {
    void printP10(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                if (i==0 || j == 0 || j==n-1 || i == n-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern10 p10 = new pattern10();
        p10.printP10(5);
    }
}
