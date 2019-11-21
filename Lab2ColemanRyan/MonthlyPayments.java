import java.util.Scanner;

public class MonthlyPayments {
    public static void main(String[] args) {
        Scanner pymnt = new Scanner(System.in);

        System.out.println("Please enter the following informtion:");
        System.out.print("Initial amount of loan: ");
        double loan = pymnt.nextDouble();

        System.out.print("Annual interest rate (in %): ");
        double rate = pymnt.nextDouble();
        rate = rate / 100 / 12;

        System.out.print("Number of years: ");
        double years = pymnt.nextDouble();
        double months = (years * 12);

        double monthly = (loan * ((rate * Math.pow((1 + rate), months)) / (Math.pow((1 + rate), months) - 1)));

        System.out.println("\nMonthly payment: " + monthly);

        System.out.println("Total paid: " + (monthly * months));
            
        System.out.println("Interest paid: " + ((monthly * months) - loan));
    
    }
}