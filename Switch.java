import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the operation (+ for addition, - for subtraction): ");
        char operation = scanner.next().charAt(0);

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

        scanner.close();
    }
}