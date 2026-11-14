import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double firstNumber = Double.parseDouble(input.nextLine().trim());

            System.out.print("Choose an operation (+, -, *, /): ");
            String operation = input.nextLine().trim();

            System.out.print("Enter the second number: ");
            double secondNumber = Double.parseDouble(input.nextLine().trim());

            double result;
            switch (operation) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    if (secondNumber == 0) {
                        System.out.println("You cannot divide by zero.");
                        return;
                    }
                    result = firstNumber / secondNumber;
                    break;
                default:
                    System.out.println("Please choose +, -, *, or /.");
                    return;
            }

            System.out.println("Result: " + result);
        } catch (NumberFormatException exception) {
            System.out.println("Please enter valid numbers.");
        }
    }
}
