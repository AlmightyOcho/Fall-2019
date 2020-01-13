import java.util.Scanner;

public class MethodsPractice {
    public static int planParty(int f, int c, int p) {
        int total = (f+1) * c; //friends + yourself * cans
        int i = 1;
        while (true) {
            if (i * p >= total)
                return i;
                i++;
            }
        }

    public static double retirementBalance(double initial, double rate, double extra, int years, int yearsToContribute) {
        
        double total = initial;

        for (int i = 0; i < years; i++) {

            double interest = total * rate / 100;
            total = total + interest;
            if (i < yearsToContribute)
                total = total + extra;
        }
        return total;
    }

    public static void main(String[] args) {
        //System.out.println(planParty(4, 6, 4));
        //System.out.println(planParty(9, 14, 6));
        //System.out.println(planParty(4, 6, 3));
        //System.out.println(planParty(3, 2, 2));


        Scanner input = new Scanner(System.in);

        System.out.println("What is your starting balance: ");
        double initial = input.nextDouble();
        System.out.println("What is your interest rate: ");
        double rate = input.nextDouble();
        System.out.println("What is your extra contribution: ");
        double extra = input.nextDouble();
        System.out.println("How many total years are you saving: ");
        int years = input.nextInt();
        System.out.println("How many years are you contributing: ");
        int yearsToContribute = input.nextInt();


        //System.out.println(retirementBalance(1000.00, 7, 8000.00, 40, 40));
        //System.out.println(retirementBalance(1000.00, 7, 8000.00, 40, 13));
        System.out.println(retirementBalance(initial, rate, extra, years, yearsToContribute));

    }
}