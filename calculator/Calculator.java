package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter the operator (+,-,*,/,%)");
        char operator = input.next().charAt(0);
        
        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Your sum is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Your subtracted value is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("your multiplication value is: " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("your value after division: " + result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println("your value is: " + result);
                break;
            default:
                System.out.println("Invalid operator");
        }
        input.close();
    }
}
