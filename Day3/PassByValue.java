package Day3;

public class PassByValue {

    void change(int x){
        x = 10;
    }
    public static void main(String[] args) {
        PassByValue v1 = new PassByValue();
        int a = 5;
        v1.change(a);
        System.out.println(a);
    }
}
