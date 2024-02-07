//Determine if a given number is even or odd. Print a message indicating the result.

public class ProblemSolving {
    public static void main(String[] args) {
        // Define the number to check
        int num = 9;
        
        // Check if the number is even or odd
        if (num % 2 == 0){
            System.out.println(num + " is an EVEN number");
        } else{
            System.out.println(num + " is an ODD number");
        }
    }
}