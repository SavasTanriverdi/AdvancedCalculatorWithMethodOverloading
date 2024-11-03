import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Advanced Calculator!");

        // Sample usage
        System.out.println("Addition of 5 and 10: " + add(5, 10));
        System.out.println("Addition of 5, 10, and 15: " + add(5, 10, 15));

        System.out.println("Subtraction of 20 and 5: " + subtract(20, 5));
        System.out.println("Subtraction of 20, 5, and 3: " + subtract(20, 5, 3));

        System.out.println("Multiplication of 4 and 5: " + multiply(4, 5));
        System.out.println("Multiplication of 4, 5, and 2: " + multiply(4, 5, 2));

        System.out.println("Division of 20 by 5: " + divide(20, 5));
    }

    // Addition with two parameters
    public static int add(int a, int b) {
        return a + b;
    }

    // Addition with three parameters
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Subtraction with two parameters
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Subtraction with three parameters
    public static int subtract(int a, int b, int c) {
        return a - b - c;
    }

    // Multiplication with two parameters
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Multiplication with three parameters
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Division with two parameters
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
}