package PatternsPractices;

public class pattern5 {

    void print(int number){
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern5 p1 = new pattern5();

        p1.print(3);
        System.out.println();
        p1.print(5);
        
    }
}
