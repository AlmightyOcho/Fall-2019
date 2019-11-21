import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer 2 or above: ");
        int num = input.nextInt();
        
        for (int d = 2; d < num; d++) {
			while (num % d == 0) {	// We've found a working divisor!
				System.out.println(d);	// Prints divisors
				num = num / d; // Reassignment
				
			}
		}

		if (num > 2) {
			System.out.println(num);
		}
    }
}