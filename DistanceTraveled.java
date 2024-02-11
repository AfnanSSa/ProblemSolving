//Write a program that calculates and prints the distance traveled by an object given its initial velocity, acceleration, and time.

public class ProblemSolving {
    public static void main(String[] args) {
        // Given parameters
        double initialVelocity = 120.0; // Initial velocity in meters per second
        double acceleration = 2.0; // Acceleration in meters per second squared
        double time = 5.0; // Time in seconds

        // Calculate the distance traveled using the formula: 
        // distance = initialVelocity * time + (1/2) * acceleration * time^2
        double distance = initialVelocity * time + 0.5 * acceleration * time * time;

        // Print the distance traveled
        System.out.println("Distance traveled: " + distance + " meters");
       
    }
}