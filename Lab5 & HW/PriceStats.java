import java.util.Scanner;

public class PriceStats {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // initialise the variables
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        int count = 0;
        double sum = 0.0;
        while (true) {
  
            System.out.print("Enter daily stock price (0 to exit): ");

            double price = input.nextDouble();

            if (price == 0)
                break;
            
            // check for negative numbers
            if (price < 0) {
                System.out.println("Stock price can't be negative! Care to try again?");
            }

            else {
                // update max/min values
                if (price > max)
                    max = price;
                if (price < min)
                    min = price;
                
                // add to sum
                sum += price;

                // inc. the count
                count++;
            }
        }

        // print the stats
        System.out.println("\nStats over " + count + " trading day(s):");
        System.out.println("Average: $" + sum / count);
        System.out.println("High:    $" + max);
        System.out.println("Low:     $" + min);
        System.out.println("Range:   $" + (max - min));
    }
}
