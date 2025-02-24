import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the operation (+ for addition, - for subtraction): ");
        char operation = sc.next().charAt(0);

        int result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("The sum is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The difference is: " + result);
                break;
            default:
                System.out.println("Invalid operation!");
        }

        sc.close();
    }
}