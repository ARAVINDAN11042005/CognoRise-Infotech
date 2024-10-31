import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.println("Enter the Operator('+','-','*','/'):");
        char Operator = sc.next().charAt(0);
        double Result = 0;
        switch (Operator) {
            case '+':
                Result = num1 + num2;
                break;
            case '-':
                Result = num1 - num2;
                break;
            case '*':
                Result = num1 * num2;
                break;
            case '/':
                Result = num1 / num2;
                break;
            default:
                System.out.println("Please give the correct Input..");
        }
        System.out.println("The Final Result is:");
        System.out.println();
        System.out.println(num1 + " " + Operator + " " + num2 + " = " + Result);
        sc.close();
    }

}
