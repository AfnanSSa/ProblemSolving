//Write a program that calculates and prints the total distance covered by a car given its average speed and the time traveled.

public class ProblemSolving {
    public static void main(String[] args) {
        // Given parameters
        double averageSpeed = 100.0; // Average speed of the car in kilometers per hour
        double timeTraveled = 2.5; // Time traveled by the car in hours

        // Calculate the total distance covered using the formula: distance = speed * time
        double distanceCovered = averageSpeed * timeTraveled;

        // Print the total distance covered
        System.out.println("Total distance covered by the car: " + distanceCovered + " kilometers");
        
    }
}