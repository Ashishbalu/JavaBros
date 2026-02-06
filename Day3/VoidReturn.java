package Day3;

public class VoidReturn {
    void sum(int a, int b){
        int sum = a+b;
        System.out.println("The sum of a and b is: " + sum);
    }

    int add(int x, int y){
       return x + y;
    }

    public static void main(String[] args) {
        VoidReturn s1 = new VoidReturn();
        int result = s1.add(3, 5);
        System.out.println("The sum of x and y is: " + result);
        s1.sum(2, 5);
    }
    
}
