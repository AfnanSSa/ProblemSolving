//Write a program that calculates and prints the number of days, weeks, and years equivalent to a given number of seconds.

public class ProblemSolving {
    public static void main(String[] args) {
        // Given number of seconds
        long seconds = 1234567890; 
        
        // Calculate the equivalent number of years, weeks, and days
        long years = seconds / (60 * 60 * 24 * 365);
        long remainingSeconds = seconds % (60 * 60 * 24 * 365);

        long weeks = remainingSeconds / (60 * 60 * 24 * 7);
        remainingSeconds %= (60 * 60 * 24 * 7);

        long days = remainingSeconds / (60 * 60 * 24);

        // Print the equivalent number of years, weeks, and days
        System.out.println("Equivalent to:");
        System.out.println("Years: " + years);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + days);
        
    }
}