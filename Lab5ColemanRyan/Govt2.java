import java.util.Scanner;

public class Govt2 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("How old are you? (enter anything negative or above 120 to exit)");
            
            int age = input.nextInt();

            if (age < 0 || age > 120) {
                System.out.println("Bye Bye!");
                System.exit(1);
            }
            
            else if (age >= 25 && age < 30) {
                System.out.println("You can serve in these positions: ");
                System.out.println("House");
            }
            else if (age >= 30 && age < 35) {
                System.out.println("You can serve in these positions: ");
                System.out.println("House");
                System.out.println("Senate");
            }
            else if (age >= 35 && age < 121) {
                System.out.println("You can serve in these positions: ");
                System.out.println("House");
                System.out.println("Senate");
                System.out.println("President");
            }

            else {
                System.out.println("You can serve in these positions: ");
                System.out.println("No positions");
            }
    }
}
        
    