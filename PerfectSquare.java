//Write a program that determines whether a given number is a perfect square (i.e., the square of an integer) and prints the result

public class ProblemSolving {
    public static void main(String[] args) {
        // Define the number to check for perfect square
        int number = 25;
        
        // Initialize a boolean variable to store the result
        boolean isPerfectSquare = false;

        // Check if the number is non-negative
        if (number >= 0) {
            // Calculate the square root of the number
            int sqrt = (int) Math.sqrt(number);
            
            // Check if the square of the square root is equal to the original number
            isPerfectSquare = (sqrt * sqrt == number);
        }

        // Print the result based on the value of isPerfectSquare
        if (isPerfectSquare) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
       
    }
}