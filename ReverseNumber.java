public class ReverseNumber {
    public static void main(String[] args) {
        // Step 1: Original number
        int originalNumber = 90611645;

        // Step 2: Reversing the digits
        int reversedNumber = reverseDigits(originalNumber);

        // Display the result
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    // Function to reverse the digits of a number
    public static int reverseDigits(int number) {
        int reversedNumber = 0;

        // Iterate through each digit of the number
        while (number != 0) {
            // Extract the last digit
            int digit = number % 10;

            // Build the reversed number by multiplying the current result by 10 and adding the digit
            reversedNumber = reversedNumber * 10 + digit;

            // Remove the last digit from the original number
            number /= 10;
        }

        // Return the reversed number
        return reversedNumber;
    }
}
