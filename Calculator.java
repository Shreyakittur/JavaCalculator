import java.util.Scanner;

public class Calculator {

    // Method for Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for Division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean keepRunning = true;
            
            while (keepRunning) {
                System.out.println("\n--- Calculator Menu ---");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                
                int choice = scanner.nextInt();
                double num1, num2, result;
                
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        result = add(num1, num2);
                        System.out.println("Result = " + result);
                    }
                    case 2 -> {
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        result = subtract(num1, num2);
                        System.out.println("Result = " + result);
                    }
                    case 3 -> {
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        result = multiply(num1, num2);
                        System.out.println("Result = " + result);
                    }
                    case 4 -> {
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        result = divide(num1, num2);
                        System.out.println("Result = " + result);
                    }
                    case 5 -> {
                        keepRunning = false;
                        System.out.println("Exiting calculator. Goodbye!");
                    }
                    default -> System.out.println("Invalid option. Try again.");
                }
            }
        }
    }
}