import java.util.Scanner;

public class TuitionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many total hours are you taking? ");
        int classHours = input.nextInt();

        System.out.print("How many of those hours are from engineering/science classes? ");
        int esClasses = input.nextInt();

        System.out.print("\nSummary of Charges:\n-------------------\n");

        if (classHours < 12) {
            System.out.println("($400 per credit hour up to 12) * (" + classHours +" credit hours) = $" + (400 * 12));
        } 
        else if (classHours > 12 ) {
            System.out.println("($400 per credit hour up to 12) * (12 credit hour(s)   = $" + (400 * 12));
        }
        if (classHours >= 13) {
            System.out.println("($60 per credit hour beyond 12) * ("+ (classHours - 12) + " credit hour(s)   = $" + (classHours - 12) * 60);
        }
        if (esClasses > 0) {
            System.out.println("($25 per eng./sci. credit hour) * ("+ esClasses + " credit hour(s)) = $" + (esClasses * 25));
        }

        if (classHours > 12) {
            int tuition = (12 * 400) + (25 * esClasses) + ((classHours - 12) * 60);
            System.out.println("TOTAL                                                 = $" + tuition);
        }
        else {
            int tuition = (classHours * 400) + (25 * esClasses);
            System.out.println("TOTAL                                                = $" + tuition);
        }
    }
}