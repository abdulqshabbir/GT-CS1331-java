import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class currentFormatter {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int numItems;
        double price, total;

        System.out.print("Enter the number of items you wish to buy: ");
        numItems = input.nextInt();
        System.out.print("Enter the price of the item: ");
        price = input.nextDouble();
        total = price * numItems;
        NumberFormat formatter = java.text.NumberFormat.getCurrencyInstance();
        System.out.printf("Your total is " + formatter.format(total) + '\n');
        input.close();
    }    
}
