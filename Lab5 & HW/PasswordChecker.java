import java.util.Scanner;

public class PasswordChecker {
   public static void main(String[] args) {
       int chances = 5;

       String pass = "hello";

       Scanner input = new Scanner(System.in);

       while (chances > 0) {
           System.out.print("Enter password: ");
           String guess = input.nextLine();

           if (pass.equals(guess)) {
               System.out.println("Access granted, welcome.");
               break;
           }
           chances--;

           if (chances > 0) {
               System.out.println("Incorrect password. You have " + chances + " attempts remaining before system lockout.");
           }
           else {
               System.out.println("Your account has been disabled for 24 hours. The authorities have been notified.");
           }
       }
   }
}