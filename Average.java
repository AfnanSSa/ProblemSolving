/*Create a program that calculates the average of three exam scores (integral types)
 and prints the result with two decimal places (floating-point type).*/

class ProblemSolving {
    public static void main(String[] args) {
        int firstScore =80;
        int secondScore=98;
        int thirdScore=70;
        float average = (firstScore+secondScore+thirdScore)/3;
        System.out.println("Average: " + average);
    }
}