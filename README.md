AdvancedCalculatorWithMethodOverloading

This project is an advanced calculator built in Java using method overloading. The calculator supports basic arithmetic operations: addition, subtraction, multiplication, and division. Method overloading allows the calculator to handle operations with either two or three parameters, giving the user flexibility in how they use each function.
Project Structure

    AdvancedCalculatorWithMethodOverloading.java: Contains the main method for demonstrating the calculator's functionality and overloaded methods for each arithmetic operation.

Code Overview
Methods

    add(int a, int b) and add(int a, int b, int c)
        Description: Adds two or three integers.
        Parameters:
            For two integers: int a, int b.
            For three integers: int a, int b, int c.
        Returns: int - the sum of the parameters.

    subtract(int a, int b) and subtract(int a, int b, int c)
        Description: Subtracts the second integer from the first (or subtracts the third from the result).
        Parameters:
            For two integers: int a, int b.
            For three integers: int a, int b, int c.
        Returns: int - the result of the subtraction.

    multiply(int a, int b) and multiply(int a, int b, int c)
        Description: Multiplies two or three integers.
        Parameters:
            For two integers: int a, int b.
            For three integers: int a, int b, int c.
        Returns: int - the product of the parameters.

    divide(double a, double b)
        Description: Divides a by b.
        Parameters:
            double a - the numerator.
            double b - the denominator.
        Returns: double - the result of the division.
        Error Handling: If b is 0, an error message is displayed, and the method returns 0.

Usage

    Welcome to the Advanced Calculator!
    Addition of 5 and 10: 15
    Addition of 5, 10, and 15: 30
    Subtraction of 20 and 5: 15
    Subtraction of 20, 5, and 3: 12
    Multiplication of 4 and 5: 20
    Multiplication of 4, 5, and 2: 40
    Division of 20 by 5: 4.0

Key Concepts

    Method Overloading: Allows the same method name to perform different tasks based on the number or type of parameters.
    Error Handling: The division method includes a check for division by zero, displaying an error message and returning 0 if the divisor is zero.

Author

This project is an example of a basic calculator that demonstrates method overloading in Java. It is designed for educational purposes.

