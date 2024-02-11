//Write a program that calculates and prints the total cost of purchasing a given quantity of items at a specified price per item.

public class ProblemSolving {
    public static void main(String[] args) {
        // Item 1
        int quantityItem1 = 5; // Quantity of item 1
        double pricePerItem1 = 10.99; // Price per item 1 in dollars

        // Item 2
        int quantityItem2 = 3; // Quantity of item 2
        double pricePerItem2 = 7.50; // Price per item 2 in dollars

        // Item 3
        int quantityItem3 = 8; // Quantity of item 3
        double pricePerItem3 = 3.25; // Price per item 3 in dollars

        // Calculate the total cost for each item
        double totalCostItem1 = quantityItem1 * pricePerItem1;
        double totalCostItem2 = quantityItem2 * pricePerItem2;
        double totalCostItem3 = quantityItem3 * pricePerItem3;

        // Print the total cost for each item
        System.out.println("Total cost of purchasing " + quantityItem1 + " items at $" + pricePerItem1 + " per item: $" + totalCostItem1);
        System.out.println("Total cost of purchasing " + quantityItem2 + " items at $" + pricePerItem2 + " per item: $" + totalCostItem2);
        System.out.println("Total cost of purchasing " + quantityItem3 + " items at $" + pricePerItem3 + " per item: $" + totalCostItem3);

        // Calculate and print the overall total cost
        double overallTotalCost = totalCostItem1 + totalCostItem2 + totalCostItem3;
        System.out.println("Overall total cost: $" + overallTotalCost);
        
    }
}