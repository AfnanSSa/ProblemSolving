//Write a program that calculates and prints the total cost of painting a room given its dimensions and the cost of paint per square meter.

public class ProblemSolving {
    public static void main(String[] args) {
        // Given parameters
        double width = 5.0; // Width of the room in meters
        double length = 7.0; // Length of the room in meters
        double height = 3.0; // Height of the room in meters
        double costPerSquareMeter = 10.0; // Cost of paint per square meter in dollars

        // Calculate the surface area to be painted (four walls and ceiling)
        double surfaceArea = 2 * (width * height + length * height) + width * length;

        // Calculate the total cost of painting
        double totalCost = surfaceArea * costPerSquareMeter;

        // Print the total cost of painting
        System.out.println("Total cost of painting the room: $" + totalCost);
       
    }
}