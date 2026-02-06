package PatternsPractices;

public class pattern6 {

    void print(int n){
        for(int i =1; i<=n; i++){
            for (int j = 1; j <= n-i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern6 p6 = new pattern6();

        p6.print(5);
        
    }
    
}
