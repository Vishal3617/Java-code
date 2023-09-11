import java.util.Scanner;

public class shopkeeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the original price of the article
        System.out.print("Enter the price of the article: ");
        double originalPrice = scanner.nextDouble();

        // Calculate the price after a 30% discount
        double discountPrice1 = originalPrice * 0.7; // 30% discount

        // Calculate the price after two successive discounts of 20% and 10%
        double discountPrice2 = originalPrice * 0.8 * 0.9; // 20% and 10% discounts

        // Display the results
        System.out.println("Price after a 30% discount: $" + discountPrice1);
        System.out.println("Price after two successive discounts (20% and 10%): $" + discountPrice2);

        // Compare the prices and determine the better offer
        if (discountPrice1 < discountPrice2) {
            System.out.println("The 30% discount offer is better for the customer.");
        } else if (discountPrice1 > discountPrice2) {
            System.out.println("The two successive discounts (20% and 10%) offer is better for the customer.");
        } else {
            System.out.println("Both offers result in the same final price.");
        }

        scanner.close();
    }
}
