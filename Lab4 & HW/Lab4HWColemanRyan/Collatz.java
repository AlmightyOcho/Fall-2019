import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.print("Enter starting value (must be a positive integer): ");
        int nums = input.nextInt();

        int i;

        for (i = 1; nums >= 1; i++) {          // while nums is positive
            
            System.out.println(nums);
            
            if (nums == 1) {
                System.out.println("Number of terms: " + i);
                return;
            }
            else if (nums % 2 == 0) {     // if even number, divide by 2
                nums = nums / 2;
            }
            else {                  // else if odd number, multi. by 3 & add 1
                nums = 3 * nums + 1;
            }

        }     
        
    }
}