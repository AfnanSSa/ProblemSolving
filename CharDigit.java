// Write a program that checks if a given character (char) is a digit. Print a boolean result.

public class ProblemSolving {
    public static void main(String[] args) {
        // Define the character to check
        char ch = '9';

        // Check if the character is a digit
        // Compare the character to ASCII values of digits '0' and '9'
        boolean isDigit = (ch >= '0' && ch <= '9');

        // Print the result
        System.out.println("Is '" + ch + "' a digit? " + isDigit);
    }
}