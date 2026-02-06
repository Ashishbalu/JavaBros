package Day3;

public class MethodOverloading {


    int add(int a, int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        int r1 = obj.add(12, 2);
        System.out.println("The sum of a and b is: " + r1);
        int r2 = obj.add(3, 2, 2);
        System.out.println("The sum of a, b and c is : " + r2);
    }
}
