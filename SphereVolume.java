//Write a program that calculates the volume of a sphere given its radius and prints the result.

public class ProblemSolving {
    public static void main(String[] args) {
        // Define radius and pi 
        double radius = 1; 
        final double pi = 3.14; 
        
        //Calculate volume using the formula V = (4/3) * pi * r^3

        double volume = (4.0 / 3.0) * pi * Math.pow(radius, 3); // Math.pow(radius, 3) = radius * radius * radius

        //Print result
        System.out.println("Volume is:" + volume);
       
    }
}