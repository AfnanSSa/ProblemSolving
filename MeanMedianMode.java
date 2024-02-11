//Write a program that calculates the mean, median, mode of three numbers and prints the result.

public class ProblemSolving {
    public static void main(String[] args) {
        // Define 3 numbers
        int firstNum = 10;
        int secondNum = 7;
        int thirdNum = 9; 
        
        // Calculate mean
        int mean = (firstNum + secondNum + thirdNum) / 3;

        // Calculate median
        int median;
        if ((firstNum <= secondNum && firstNum >= thirdNum) || (firstNum >= secondNum && firstNum <= thirdNum)) {
            median = firstNum;
        } else if ((secondNum <= firstNum && secondNum >= thirdNum) || (secondNum >= firstNum && secondNum <= thirdNum)) {
            median = secondNum;
        } else {
            median = thirdNum;
        }

        // Calculate mode
        int mode;
        if (firstNum == secondNum && secondNum == thirdNum) {
            mode = firstNum;
        } else if (firstNum == secondNum || firstNum == thirdNum) {
            mode = firstNum;
        } else if (secondNum == thirdNum) {
            mode = secondNum;
        } else {
            mode = -1; // Indicate that there is no mode
        }
        
        //printig results
        System.out.println("Mean is: " + mean);
        System.out.println("Median is: " + median);
        if (mode == -1) {
            System.out.println("Mode: None (No mode exists)");
        } else {
            System.out.println("Mode: " + mode);
        }
       
    }
}